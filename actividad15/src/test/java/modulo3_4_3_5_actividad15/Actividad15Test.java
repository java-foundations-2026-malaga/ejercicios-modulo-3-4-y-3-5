package modulo3_4_3_5_actividad15;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class Actividad15Test {

    @Test
    void compruebaCodigoFuente() throws Exception {
        String codigo = leerCodigoFuente();
        assertTrue(contiene(codigo, "JOptionPane\\s*\\.\\s*showInputDialog\\s*\\("),
                "Debes pedir el dato con JOptionPane.showInputDialog.");
        assertTrue(contiene(codigo, "JOptionPane\\s*\\.\\s*showMessageDialog\\s*\\("),
                "Debes mostrar el resultado con JOptionPane.showMessageDialog.");
        assertTrue(contiene(codigo, "(Double|Integer)\\s*\\.\\s*(parseDouble|parseInt|valueOf)\\s*\\("),
                "Debes convertir el texto a numero (Double.parseDouble o Integer.parseInt) antes de operar.");
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
}
