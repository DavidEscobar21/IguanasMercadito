package edu.ujcv.progra2;

public class pila {
    private MenuDeProductos UltimoProductoIngresado;
    int tamano = 0;
    String lista = "";

    public pila(){
        UltimoProductoIngresado = null;
        tamano = 0;
    }
    public void IngreseProducto(int nodo){


        MenuDeProductos Nuevo_Producto = new MenuDeProductos(nodo);

        Nuevo_Producto.siguiente = UltimoProductoIngresado;
        UltimoProductoIngresado = Nuevo_Producto;
        tamano++;
    }
    public String Eliminar_Producto(){
 String Auxiliar = UltimoProductoIngresado.producto;
 UltimoProductoIngresado = UltimoProductoIngresado.siguiente;
 tamano--;
 return Auxiliar;
    }

    public  void MostrarProductos(){

        MenuDeProductos recorrido = UltimoProductoIngresado;

        while (recorrido != null) {
            lista += recorrido.producto + "\n";
            recorrido = recorrido.siguiente;
        }
        System.out.println(lista);
        lista = "";

    }
}
