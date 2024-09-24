Estudiante: Diego Alejandro Parra
Correo:  [diegoalejandro.parra652@comunidadunir.net](mailto:diegoalejandro.parra652@comunidadunir.net)

# Documentación Técnica: Implementación de un Árbol Binario de Búsqueda (ABB)

## 1. **Introducción**

El presente documento describe la implementación de un Árbol Binario de Búsqueda (ABB) en el lenguaje de programación Java, junto con las operaciones básicas que debe soportar. El propósito de este laboratorio es demostrar cómo se puede usar un ABB para realizar inserción, borrado y recorridos preorden, inorden y posorden de sus elementos. También se incluye una clase de prueba para validar el correcto funcionamiento de las operaciones solicitadas.

## 2. **Estructura del Proyecto**

El proyecto está compuesto por las siguientes clases:

- **`AppTest.java`**: Clase principal que se encarga de ejecutar la aplicación y realizar las pruebas de las operaciones del ABB.
- **`BinarySearchTree.java`**: Clase que define el árbol binario de búsqueda y sus operaciones principales.
- **`Node.java`**: Clase que define la estructura del nodo del árbol.

### Diagrama de la Estructura:

```bash
src/
│
├── binary_search_tree/
│   ├── BinarySearchTree.java
│   └── Node.java
│
└── AppTest.java
```

## 3. **Clases Principales**

### 3.1 **Clase `Node`**

Esta clase representa un nodo individual del árbol binario. Cada nodo contiene un valor entero y referencias a sus hijos izquierdo y derecho.

### 3.2 **Clase `BinarySearchTree`**

Esta clase contiene la implementación de las principales operaciones del árbol binario de búsqueda, tales como inserción, eliminación y los recorridos en preorden, inorden y posorden.

### Métodos principales:

- **`insert(int value)`**: Inserta un nuevo valor en el árbol respetando las reglas de un ABB.
- **`delete(int value)`**: Elimina un valor del árbol ajustando las relaciones de los nodos para mantener la estructura del ABB.
- **`traverseInOrder()`**: Retorna una lista con los valores del árbol siguiendo el recorrido inorden (izquierda, raíz, derecha).
- **`traversePreOrder()`**: Retorna una lista con los valores del árbol siguiendo el recorrido preorden (raíz, izquierda, derecha).
- **`traversePostOrder()`**: Retorna una lista con los valores del árbol siguiendo el recorrido posorden (izquierda, derecha, raíz).
- **`printInOrder()`**: Imprime los valores del árbol en un recorrido inorden.

### 3.3 **Clase `AppTest`**

Esta clase es responsable de probar el funcionamiento de las operaciones implementadas en `BinarySearchTree`. Inserta una serie de valores en el árbol, realiza recorridos (preorden, inorden, posorden) y elimina elementos.

## 4. **Pruebas**

Para las pruebas se adjunta el archivo `estructura-de-datos-taller-2.jar` el cual se ejecuta corriendo el siguiente comando en la consola 

```bash
java -jar estructura-de-datos-taller-2.jar
```

La salida de este debe mostrar el siguiente texto:

```bash
Imprimir en orden (inorder)
[20, 30, 40, 50, 60, 70, 80]

Imprimir en posorden (postorder)
[20, 40, 30, 60, 80, 70, 50]

Imprimir en preorden (preorder)
[50, 30, 20, 40, 70, 60, 80]

Delete 20
30 40 50 60 70 80
```