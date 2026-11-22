package modulo3_4_3_5_actividad07;

public class Actividad07 {
    public static void main(String[] args) throws Exception {
        String precioTexto = "7.5";

        // TODO: convierte a double y calcula dos unidades.
        /*Precio unitario: 7.5
Precio dos unidades: 15.0
         * 
         */
        
        double nro = Double.parseDouble(precioTexto);
        System.out.println("Precio unitario:"+ nro);
        System.out.println("Precio dos unidades:"+ nro*2);
    }
}
