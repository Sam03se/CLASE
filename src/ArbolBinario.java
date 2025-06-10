import java.util.*;
// Definición de la clase pública Árbol Binario
public class ArbolBinario {
    // Referencia al nodo raíz del árbol
    Nodo raiz;
    // Constructor para inicializar el árbol vacío
    public ArbolBinario() {
        raiz = null;
    }
    // Método para agregar un valor al árbol
    public void agregar(int valor) {
        raiz = agregarRecursivo(raiz, valor);
    }
    // Método recursivo para agregar un valor al árbol
    private Nodo agregarRecursivo(Nodo raiz, int valor) {
// Si el árbol está vacío, crea un nuevo nodo
        if (raiz == null) {
            return new Nodo(valor);



            // Método para realizar un recorrido Preorden en un árbol binario
            public void preorden(Nodo nodo) {
                if (nodo != null) {
                    System.out.print(nodo.valor + " "); // Visita el nodo raíz
                    preorden(nodo.izquierdo); // Recorre el subárbol izquierdo
                    preorden(nodo.derecho); // Recorre el subárbol derecho
                }
            }
        }




// Si el valor es menor que el valor del nodo actual, se agrega a la izquierda
        if (valor < raiz.valor) {
            raiz.izquierdo = agregarRecursivo(raiz.izquierdo, valor);
        }
// Si el valor es mayor que el valor del nodo actual, se agrega a la derecha
        else if (valor > raiz.valor) {
            raiz.derecho = agregarRecursivo(raiz.derecho, valor);
        }
// Retorna el nodo (sin cambios)
        return raiz;
    }
}