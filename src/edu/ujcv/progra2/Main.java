package edu.ujcv.progra2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int opcion = 0;
int nodo;
pila Pila = new pila();

do {
    System.out.println("Ingrese una opcion");
    System.out.println("");
    System.out.println("1. Agregar Producto");
    System.out.println("2. Eliminar el ultimo capitulo");
    System.out.println("3. Mostrar Productos");
    System.out.println("4. Salir");
    System.out.println("");
    opcion = sc.nextInt();

    switch (opcion){
        case 1:
            System.out.println("Ingrese una opcion");
            System.out.println("");
            System.out.println(" Alimento ...... Codigo ...... Precio");
            System.out.println("1. Pollo ....... 000001 ...... 25 LPS");
            System.out.println("2. Pescado ..... 000002 ...... 48 LPS");
            System.out.println("3. Coca-Cola ... 000003 ...... 53 LPS");
            System.out.println("4. Doritos ..... 000004 ...... 21 LPS");
            System.out.println("5. Helado  ..... 000005 ...... 75 LPS");
            System.out.println("6. Leche   ..... 000006 ...... 24 LPS");
            System.out.println("7. Papas   ..... 000007 ...... 18 LPS");
            System.out.println("8. Tomate  ..... 000008 ...... 5 LPS");
            System.out.println("9. Manzanas .... 000009 ...... 18 LPS");
            System.out.println("10. Uvas ....... 000010 ...... 5 LPS");
            Pila.IngreseProducto(sc.nextInt());
            break;
        case 2:
            Pila.Eliminar_Producto();
            System.out.println("se elimino el ultimo producto");
            break;
        case 3:
            Pila.MostrarProductos();
            break;

    }


}while (opcion != 4);

    }
}
