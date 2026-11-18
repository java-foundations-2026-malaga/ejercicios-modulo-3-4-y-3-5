package modulo3_4_3_5_actividad20;

import java.util.Scanner;

public class Actividad20 {
    public static void main(String[] args) throws Exception {
        String datos = "Ana libro 2 12.5";
        Scanner input = new Scanner(datos).useLocale(java.util.Locale.US);

        // TODO: lee nombre, producto, cantidad y precio.
        String nombre = input.next();
        String producto = input.next();
        int cantidad = input.nextInt();
        double precio = input.nextDouble();
        System.out.println("Nombre: "+nombre+"\nProducto: "+producto+"\nCantidad: "+cantidad+"\nPrecio: "+precio);
    }
}
