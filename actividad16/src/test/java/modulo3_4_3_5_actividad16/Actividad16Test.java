package modulo3_4_3_5_actividad16;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class Actividad16Test {

    @Test
    void pruebaSalidaEsperada() throws Exception {
        String salida = ejecutarMain("Marta\n");
        comprobarContiene(salida, "Hola, Marta");
    }

    @Test
    void pruebaConOtrosDatos() throws Exception {
        String salida = ejecutarMain("Sergio\n");
        comprobarContiene(salida, "Hola, Sergio");
    }

    private static String ejecutarMain(String entrada) throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        Locale originalLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        System.setIn(new ByteArrayInputStream(entrada.getBytes(StandardCharsets.UTF_8)));
        System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
        try {
            Actividad16.main(new String[0]);
        } finally {
            System.setOut(originalOut);
            System.setIn(originalIn);
            Locale.setDefault(originalLocale);
        }
        return buffer.toString(StandardCharsets.UTF_8).replace("\r\n", "\n");
    }

    private static void comprobarContiene(String salida, String... esperadas) {
        String[] lineas = salida.replace("\r\n", "\n").split("\n");
        for (String esperada : esperadas) {
            boolean encontrada = false;
            for (String linea : lineas) {
                String texto = linea.strip();
                int etiqueta = esperada.indexOf(':');
                String inicio = etiqueta >= 0 ? esperada.substring(0, etiqueta + 1) : esperada;
                int pos = texto.indexOf(inicio);
                while (pos >= 0 && !encontrada) {
                    boolean inicioPalabra = pos == 0 || !Character.isLetter(texto.charAt(pos - 1));
                    encontrada = inicioPalabra && lineasEquivalentes(esperada, texto.substring(pos));
                    pos = texto.indexOf(inicio, pos + 1);
                }
            }
            assertTrue(encontrada, "Falta en la salida: " + esperada + "\nSalida obtenida:\n" + salida);
        }
    }

    private static boolean lineasEquivalentes(String esperada, String real) {
        real = real.strip();
        if (esperada.equals(real)) {
            return true;
        }
        int separador = esperada.lastIndexOf(": ");
        if (separador < 0 || !real.startsWith(esperada.substring(0, separador + 1))) {
            return false;
        }
        String valorEsperado = esperada.substring(separador + 2);
        String valorReal = real.substring(separador + 1).strip();
        if (!valorEsperado.contains(".")) {
            return valorEsperado.equals(valorReal);
        }
        try {
            double a = Double.parseDouble(valorEsperado);
            double b = Double.parseDouble(valorReal);
            return Math.abs(a - b) < 1e-6;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
