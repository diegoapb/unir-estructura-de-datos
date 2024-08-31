// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Laboratorio: Implementación de una lista doblemente enlazada \n\n");

    DoublyLinkedList list1 = new DoublyLinkedList();

    // Insertar elementos
    list1.add("A");
    list1.add("B");
    list1.add("C");
    list1.add("D");
    System.out.println("Lista 1: ");
    list1.printList();

    // Contar elementos
    System.out.println("Número de elementos: " + list1.getSize());

    // Mostrar elemento en posición concreta
    System.out.println("Elemento en la posición 2: " + list1.get(2));

    // Comprobar si un elemento está en la lista
    System.out.println("¿La lista contiene 'C'? " + list1.contains("C"));

    // Sacar un elemento concreto de la lista
    System.out.println("Lista Inicial");
    list1.printList();
    System.out.println("Sacando 'B' de la lista: ");
    list1.remove("B");
    list1.printList();

    // Sacar un elemento por su posición
    System.out.println("Sacando el elemento en la posición 1 de la lista: ");
    list1.removeAt(1);
    list1.printList();

    // Reemplazar un elemento
    System.out.println("Reemplazando el elemento en la posición 0 con 'X': ");
    list1.replace(0, "Z");
    list1.printList();

    // Concatenar dos listas
    System.out.println("Concatenando dos listas:");
    System.out.println("Lista 1:");
    list1.printList();
    System.out.println("Lista 2:");

    DoublyLinkedList list2 = new DoublyLinkedList();
    list2.add("X");
    list2.add("Y");

    list2.printList();

    list1.concatenate(list2);

    System.out.println("Lista 1 concatenada con Lista 2");
    list1.printList();
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}
