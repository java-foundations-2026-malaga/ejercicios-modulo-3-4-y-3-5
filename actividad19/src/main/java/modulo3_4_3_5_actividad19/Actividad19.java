package modulo3_4_3_5_actividad19;

import javax.swing.JOptionPane;

public class Actividad19 {
    public static void main(String[] args) throws Exception {
        String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
        String ciudad = JOptionPane.showInputDialog("¿En qué ciudad vives?");

        JOptionPane.showMessageDialog(null, "Hola, " + nombre + ". Vives en " + ciudad + ".");
    }
}
