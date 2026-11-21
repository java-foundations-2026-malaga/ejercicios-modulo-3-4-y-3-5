package modulo3_4_3_5_actividad17;

import java.util.Scanner;

public class Actividad17 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
       String edad = input.nextLine();
             int años = Integer.parseInt(edad);

        System.out.println("Edad proximo ano:" + (años + 1));
 
        
    }
}
