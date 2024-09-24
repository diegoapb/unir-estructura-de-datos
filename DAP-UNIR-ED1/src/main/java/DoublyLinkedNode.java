/**
 * Representa un nodo en una lista doblemente enlazada.
 * Cada nodo contiene datos y referencias al siguiente y al anterior nodo.
 */
public class DoublyLinkedNode {

    /**
     * Los datos almacenados en este nodo.
     */
    String data;

    /**
     * La referencia al siguiente nodo en la lista.
     * Es null si no hay un nodo siguiente.
     */
    DoublyLinkedNode next;

    /**
     * La referencia al nodo anterior en la lista.
     * Es null si no hay un nodo anterior.
     */
    DoublyLinkedNode prev;

    /**
     * Construye un nuevo nodo con los datos especificados.
     * Las referencias al siguiente y al anterior se inicializan a null.
     *
     * @param data Los datos que se almacenarán en este nodo.
     */
    public DoublyLinkedNode(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
