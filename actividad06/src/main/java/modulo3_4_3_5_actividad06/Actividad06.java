package modulo3_4_3_5_actividad06;

public class Actividad06 {
    public static void main(String[] args) throws Exception {
        String edadTexto = "15";

        // TODO: convierte a int y calcula la edad del proximo anio.
        //Edad actual: 15
       // Edad proximo anio: 16
        
        int edadActual = Integer.parseInt(edadTexto);
        
        System.out.println("Edad actual:"+ edadActual);
        int edadAnio = edadActual+1;
        System.out.println("Edad proximo anio:"+ edadAnio);
    }
}
