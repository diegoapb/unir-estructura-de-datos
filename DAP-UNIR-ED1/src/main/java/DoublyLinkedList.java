public class DoublyLinkedList {

    // Clase interna para los nodos
    private class Node {
        String data;
        Node prev;
        Node next;

        Node(String data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Campos de la clase DoublyLinkedList
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Métodos de la lista
    // 1. Contar el número de elementos
    public int getSize() {
        return size;
    }

    // 2. Mostrar el elemento en una posición concreta
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // 3. Comprobar si un elemento está en la lista
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

    // 4. Imprimir los elementos que contiene la lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // 5. Insertar un elemento nuevo
    public void add(String value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // 6. Sacar un elemento concreto de la lista
    public boolean remove(String value) {
        Node current = head;

        while (current != null) {
            if (current.data.equals(value)) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    current.prev.next = current.next;
                }

                if (current == tail) {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    current.next.prev = current.prev;
                }

                size--;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    // 7. Sacar el elemento que ocupa una posición en la lista
    public String removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        String removedData = current.data;

        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            current.prev.next = current.next;
        }

        if (current == tail) {
            tail = current.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            current.next.prev = current.prev;
        }

        size--;
        return removedData;
    }

    // 8. Concatenar dos listas
    public void concatenate(DoublyLinkedList otherList) {
        if (otherList.head == null) {
            return;
        }

        if (this.tail == null) {
            this.head = otherList.head;
            this.tail = otherList.tail;
        } else {
            this.tail.next = otherList.head;
            otherList.head.prev = this.tail;
            this.tail = otherList.tail;
        }

        this.size += otherList.size;
    }

    // 9. Reemplazar un elemento de la lista
    public void replace(int index, String newValue) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.data = newValue;
    }
}
