package modulo3_4_3_5_actividad15;

import javax.swing.JOptionPane;

public class Actividad15 {
    public static void main(String[] args) throws Exception {
        String precio = JOptionPane.showInputDialog("Precio:");
        double doble = Double.parseDouble(precio);
        double total = 	doble * 2;

        JOptionPane.showMessageDialog(null, "Total: " + total);
    }
}
