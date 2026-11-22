package modulo3_4_3_5_actividad20;

import java.util.Scanner;

public class Actividad20 {
    public static void main(String[] args) throws Exception {
        String datos = "Ana libro 2 12,5";
        Scanner input = new Scanner(datos);

        // TODO: lee nombre, producto, cantidad y precio. Usa Scanner sobre un String con datos separados por espacios.
        
        /*
         * Nombre: Ana
Producto: libro
Cantidad: 2
Precio: 12.5
         */
        
        System.out.println("Nombre: "+ input.next());
        System.out.println("Producto: "+ input.next());
        System.out.println("Cantidad: "+ input.nextInt());
        System.out.println("Precio: "+ (double)input.nextDouble());
        
        
    }
}
