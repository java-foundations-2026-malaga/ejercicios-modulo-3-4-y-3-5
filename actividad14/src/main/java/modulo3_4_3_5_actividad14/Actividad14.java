package modulo3_4_3_5_actividad14;

import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int edad = input.nextInt();
        input.nextLine(); // Consumir el salto de línea después del entero
        String nombre = input.nextLine();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
