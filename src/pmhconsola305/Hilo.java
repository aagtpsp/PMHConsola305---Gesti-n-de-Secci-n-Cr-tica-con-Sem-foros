package pmhconsola305;

import java.util.concurrent.Semaphore;

/**
 *
 * @author ifhprof01
 */
public class Hilo extends Thread {
    int valor;
    RecursoCompartido r;
    Semaphore s;

    public Hilo(int valor, RecursoCompartido r, Semaphore s) {
        this.valor = valor;
        this.r = r;
        this.s = s;
    }

    @Override
    public void run() {
        wait_sem();
        System.out.println("Incrementando con el Hilo " + valor);
        r.incrementar(valor);
        signal_sem();
        wait_sem();
        System.out.println("Decrementando con el Hilo " + valor);
        r.decrementar(valor);
        signal_sem();
    }
    
    /**
     * Método que implementa el método wait del hilo
    */
    public void wait_sem() {
        try {
            s.acquire();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());;
        }
    }
    
    /**
     * Método que implementa el método signal del hilo
    */
    public void signal_sem() {
        s.release();
    }
    
}
