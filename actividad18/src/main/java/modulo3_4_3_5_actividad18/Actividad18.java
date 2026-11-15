package modulo3_4_3_5_actividad18;

import java.util.Scanner;

public class Actividad18 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el primer número entero: ");
        int num1 = input.nextInt();

        System.out.println("Introduce el segundo número entero: ");
        int num2 = input.nextInt();

        int suma = num1 + num2;
        System.out.println("Suma: "  + suma);
        // TODO: lee dos enteros y muestra la suma.
    }
}
