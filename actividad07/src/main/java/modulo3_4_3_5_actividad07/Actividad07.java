package modulo3_4_3_5_actividad07;

public class Actividad07 {
    public static void main(String[] args) throws Exception {
        String precioTexto = "7.5";

        // TODO: convierte a double y calcula dos unidades.
        double precio = Double.parseDouble(precioTexto);
        double precioDoble = (precio*2);
        System.out.println("Precio unitario: "+precio+"\nPrecio dos unidades: "+precioDoble);
    }
}
