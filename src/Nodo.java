import java.util.*;
// Definición de la clase Nodo
public class Nodo {
    // Atributo para almacenar el valor del nodo
    int valor;
    // Referencias a los nodos hijo izquierdo y derecho
    Nodo izquierdo;
    Nodo derecho;

    // Constructor para inicializar el nodo con un valor
    public Nodo(int valor) {
        this.valor = valor;
// Inicialmente, los hijos son null
        izquierdo = derecho = null;
    }
}