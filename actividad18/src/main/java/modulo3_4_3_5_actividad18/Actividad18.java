package modulo3_4_3_5_actividad18;

import java.util.Scanner;

public class Actividad18 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // TODO: lee dos enteros y muestra la suma.
        System.out.println("Escribe dos enteros: ");
        int a = input.nextInt();
        int b = input.nextInt();
        
        int suma = a + b;
        System.out.println("Suma: "+ suma);
    }
}
