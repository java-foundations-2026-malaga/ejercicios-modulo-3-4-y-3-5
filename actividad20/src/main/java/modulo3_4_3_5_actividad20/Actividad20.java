package modulo3_4_3_5_actividad20;

import java.util.Scanner;

public class Actividad20 {
    public static void main(String[] args) throws Exception {
        String datos = "Ana libro 2 12.5";
        Scanner input = new Scanner(datos);
        input.useLocale(java.util.Locale.US);

        String nombre = input.next();
        String producto = input.next();
        int cantidad = input.nextInt();
        double precio = input.nextDouble();

        System.out.println("Nombre: " + nombre);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio);

        // TODO: lee nombre, producto, cantidad y precio.
    }
}
