/**
 * Representa un nodo en una lista doblemente enlazada.
 * Cada nodo contiene datos de tipo String y referencias al siguiente y al anterior nodo.
 *
 */
class Node {
    String data;
    Node next;
    Node prev;

    /**
     * Construye un nuevo nodo con los datos especificados.
     * Las referencias al siguiente y al anterior se inicializan en null.
     *
     * @param data El texto que se almacenará en este nodo.
     */
    public Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

/**
 * Representa una lista doblemente enlazada que puede almacenar elementos de tipo String.
 * Proporciona métodos para manipular la lista, como agregar, eliminar y buscar elementos.
 *
 */
public class DoublyLinkedStringList {
    private Node head;
    private int size;

    /**
     * Construye una lista doblemente enlazada vacía.
     */
    public DoublyLinkedStringList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Devuelve el número de elementos en la lista.
     *
     * @return El tamaño de la lista.
     */
    public int getSize() {
        return size;
    }

    /**
     * Muestra el elemento en la posición especificada de la lista.
     *
     * @param position La posición del elemento a mostrar.
     * @return El elemento en la posición especificada.
     * @throws IndexOutOfBoundsException Si la posición está fuera del rango.
     */
    public String displayAtPosition(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Posición fuera de rango.");
        }

        Node current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        return current.data;
    }

    /**
     * Verifica si un elemento específico está presente en la lista.
     *
     * @param value El elemento a verificar.
     * @return True si el elemento se encuentra en la lista, false en caso contrario.
     */
    public boolean contains(String value) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Muestra todos los elementos en la lista.
     */
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * Agrega un nuevo elemento al final de la lista.
     *
     * @param value El elemento a agregar.
     */
    public void add(String value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }

    /**
     * Elimina un elemento específico de la lista.
     *
     * @param value El elemento a eliminar.
     * @return True si el elemento fue eliminado, false si el elemento no se encontró.
     */
    public boolean remove(String value) {
        Node current = head;

        while (current != null) {
            if (current.data.equals(value)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Elimina el elemento en la posición especificada de la lista.
     *
     * @param position La posición del elemento a eliminar.
     * @return El elemento eliminado.
     * @throws IndexOutOfBoundsException Si la posición está fuera del rango.
     */
    public String removeAt(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Posición fuera de rango.");
        }

        Node current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }

        size--;
        return current.data;
    }

    /**
     * Concatena otra lista a esta lista.
     *
     * @param otherList La lista a concatenar.
     */
    public void concatenate(DoublyLinkedStringList otherList) {
        if (otherList == null || otherList.getSize() == 0) {
            return;
        }

        if (head == null) {
            head = otherList.head;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = otherList.head;
            otherList.head.prev = current;
        }

        size += otherList.getSize();
    }

    /**
     * Reemplaza el elemento en la posición especificada de la lista.
     *
     * @param position La posición del elemento a reemplazar.
     * @param value    El nuevo elemento que se establecerá en la posición especificada.
     * @throws IndexOutOfBoundsException Si la posición está fuera del rango.
     */
    public void replace(int position, String value) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Posición fuera de rango.");
        }

        Node current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        current.data = value;
    }
}
