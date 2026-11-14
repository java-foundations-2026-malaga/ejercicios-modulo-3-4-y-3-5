package modulo3_4_3_5_actividad13;

import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        
        int edad = input.nextInt();
        int proximaEdad = edad + 1;

        System.out.println("Edad proximo ano: " + proximaEdad);
        
        input.close();
    }
}
