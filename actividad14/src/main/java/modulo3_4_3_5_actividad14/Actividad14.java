package modulo3_4_3_5_actividad14;

import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce tu edad: ");
        int edad = input.nextInt();
        input.nextLine();
        
        System.out.print("Introduce tu nombre completo: ");     
        String nombre = input.nextLine();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        
        input.close();
    }
}
