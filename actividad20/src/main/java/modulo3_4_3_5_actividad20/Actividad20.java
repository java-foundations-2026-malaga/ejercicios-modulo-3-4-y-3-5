package modulo3_4_3_5_actividad20;

import java.util.Scanner;

public class Actividad20 {
    public static void main(String[] args) throws Exception {
        String datos = "Ana libro 2 12.5";
        Scanner input = new Scanner(datos);
        input = input.useDelimiter(" ");
        String name = input.next();
        String prod = input.next();
        int cantidad = input.nextInt();
        double price = input.nextDouble();


        // TODO: lee nombre, producto, cantidad y precio.
        System.out.println("Nombre: " + name);
        System.out.println("Producto: " + prod);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + price);
    }
}
