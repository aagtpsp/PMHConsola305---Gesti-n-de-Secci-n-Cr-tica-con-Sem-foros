package pmhconsola305;

/**
 *
 * @author ifhprof01
 */
public class RecursoCompartido {
    int[] lista;
    
    public RecursoCompartido() {
        lista = new int[10];
        for (int i = 0; i<10; i++) lista[i] = 0;
    }
    
    public void incrementar(int valor) {
        for (int i = 0; i<10; i++) {
            lista[i] = lista[i] + valor;
        }
        mostrar();
    }
    
    public void decrementar(int valor) {
        for (int i = 0; i<10; i++) {
            lista[i] = lista[i] - valor;
        }
        mostrar();
    }
    
    public void mostrar() {
        for (int i = 0; i<10; i++) System.out.println(lista[i]);
    }
}
