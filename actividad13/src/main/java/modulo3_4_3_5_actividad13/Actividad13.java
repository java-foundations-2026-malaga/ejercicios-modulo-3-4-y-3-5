package modulo3_4_3_5_actividad13;

import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String edad = input.nextLine();
        int proximaEdad = Integer.parseInt(edad) + 1;

        System.out.println("Edad proximo ano: " + proximaEdad);
    }
}
