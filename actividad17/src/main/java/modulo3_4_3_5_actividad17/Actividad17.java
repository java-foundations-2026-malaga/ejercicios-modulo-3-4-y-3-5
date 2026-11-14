package modulo3_4_3_5_actividad17;

import java.util.Scanner;

public class Actividad17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        
        int edad = input.nextInt();
        int edadProximoAno = edad + 1;

        System.out.println("Edad proximo ano: " + edadProximoAno);
        input.close();
    }
}
