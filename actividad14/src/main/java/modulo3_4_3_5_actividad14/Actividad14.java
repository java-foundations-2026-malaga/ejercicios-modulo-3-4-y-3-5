package modulo3_4_3_5_actividad14;

import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe tu edad y Nombre completo:");
        int edad = input.nextInt();
        
        String nombre = input.nextLine();
        
/*
 * 20
Ana Maria
 */
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
