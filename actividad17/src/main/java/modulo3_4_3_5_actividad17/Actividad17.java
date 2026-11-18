package modulo3_4_3_5_actividad17;

import java.util.Scanner;

public class Actividad17 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // TODO: lee la edad y calcula la edad del proximo anio.
        System.out.println("Introduce la edad:");
        int edad = input.nextInt();
        edad++;
        System.out.println("Edad proximo ano: "+edad);
    }
}
