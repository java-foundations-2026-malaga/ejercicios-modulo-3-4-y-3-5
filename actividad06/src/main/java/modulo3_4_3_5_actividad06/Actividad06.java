package modulo3_4_3_5_actividad06;

public class Actividad06 {
    public static void main(String[] args) throws Exception {
        String edadTexto = "15";

        // TODO: convierte a int y calcula la edad del proximo anio.
        int edad = Integer.parseInt(edadTexto);
        System.out.println("Edad actual: "+ edad);
        int prox = edad + 1;
        System.out.println("Edad proximo anio: " + prox);
        
    }
}
