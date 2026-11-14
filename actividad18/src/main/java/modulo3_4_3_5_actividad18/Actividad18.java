package modulo3_4_3_5_actividad18;

import java.util.Scanner;

public class Actividad18 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce el primer numero: ");
        int primerNumero = input.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int segundoNumero = input.nextInt();

        int suma = primerNumero + segundoNumero;

        System.out.println("Suma: " + suma);
        input.close();

        // TODO: lee dos enteros y muestra la suma.
    }
}
