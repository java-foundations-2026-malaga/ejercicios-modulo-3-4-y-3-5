package modulo3_4_3_5_actividad07;

public class Actividad07 {
    public static void main(String[] args) throws Exception {
        String precioTexto = "7.5";

        // TODO: convierte a double y calcula dos unidades.
        double precio = Double.parseDouble(precioTexto);
        System.out.println("Precio unitario: " + precio);
        double dos = precio*2;
        System.out.println("Precio dos unidades: "+ dos);
    }
}
