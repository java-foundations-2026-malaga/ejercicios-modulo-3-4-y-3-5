package modulo3_4_3_5_actividad17;

import java.util.Scanner;

public class Actividad17 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your age: ");
        int curr = input.nextInt();

        // TODO: lee la edad y calcula la edad del proximo anio.
        System.out.println("Edad proximo ano: " + (curr + 1));
    }
}
