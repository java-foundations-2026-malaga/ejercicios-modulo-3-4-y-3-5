package modulo3_4_3_5_actividad06;

public class Actividad06 {
    public static void main(String[] args) throws Exception {
        String edadTexto = "15";

        // TODO: convierte a int y calcula la edad del proximo anio.
        int edadNumero = Integer.parseInt(edadTexto);
        int edadNumeroProxAnio = edadNumero + 1;
        System.out.println("Edad actual: "+edadNumero+"\nEdad proximo anio: "+edadNumeroProxAnio);
    }
}
