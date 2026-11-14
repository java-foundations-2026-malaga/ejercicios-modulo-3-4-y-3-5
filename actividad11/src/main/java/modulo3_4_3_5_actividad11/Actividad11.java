package modulo3_4_3_5_actividad11;

import java.util.Scanner;

public class Actividad11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre);
        scanner.close();
    }
}
