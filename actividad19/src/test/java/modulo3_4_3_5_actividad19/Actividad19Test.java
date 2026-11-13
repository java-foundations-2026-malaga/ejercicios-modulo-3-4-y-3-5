package modulo3_4_3_5_actividad19;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class Actividad19Test {

    @Test
    void compruebaCodigoFuente() throws Exception {
        String codigo = leerCodigoFuente();
        assertTrue(contiene(codigo, "JOptionPane\\s*\\.\\s*showMessageDialog\\s*\\("),
                "Debes mostrar el mensaje final con JOptionPane.showMessageDialog.");
        assertTrue(contar(codigo, "JOptionPane\\s*\\.\\s*showInputDialog\\s*\\(") >= 2,
                "Debes pedir nombre y ciudad con dos llamadas a JOptionPane.showInputDialog.");
    }

    private static String leerCodigoFuente() throws Exception {
        StringBuilder codigo = new StringBuilder();
        try (Stream<Path> rutas = Files.walk(Path.of("src/main/java"))) {
            for (Path ruta : rutas.filter(r -> r.toString().endsWith(".java")).toList()) {
                codigo.append(Files.readString(ruta, StandardCharsets.UTF_8)).append('\n');
            }
        }
        return codigo.toString()
                .replaceAll("(?s)/\\*.*?\\*/", "")
                .replaceAll("//[^\n]*", "");
    }

    private static boolean contiene(String codigo, String regex) {
        return Pattern.compile(regex).matcher(codigo).find();
    }

    private static int contar(String codigo, String regex) {
        Matcher m = Pattern.compile(regex).matcher(codigo);
        int total = 0;
        while (m.find()) {
            total++;
        }
        return total;
    }
}
