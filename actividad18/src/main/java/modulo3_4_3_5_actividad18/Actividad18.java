package modulo3_4_3_5_actividad18;

import java.util.Scanner;

public class Actividad18 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // TODO: lee dos enteros y muestra la suma.
        System.out.println("Introduce un numero:");
        int numero01 = input.nextInt();
        System.out.println("Introduce otro numero:");
        int numero02 = input.nextInt();
        int suma = numero01 + numero02;
        System.out.println("Suma: "+suma);
    }
}
