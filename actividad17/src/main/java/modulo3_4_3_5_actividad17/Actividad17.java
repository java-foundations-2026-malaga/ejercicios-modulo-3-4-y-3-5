package modulo3_4_3_5_actividad17;

import java.util.Scanner;

public class Actividad17 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();
        int proximaEdad = edad + 1;
        System.out.println("Edad proximo ano: " + proximaEdad);
    }
}
