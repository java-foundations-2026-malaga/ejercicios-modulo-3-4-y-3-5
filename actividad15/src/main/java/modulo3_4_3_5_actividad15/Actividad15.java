package modulo3_4_3_5_actividad15;

import javax.swing.JOptionPane;

public class Actividad15 {
    public static void main(String[] args) throws Exception {
        String precio = JOptionPane.showInputDialog("Precio:");
        System.out.println(precio);
        double total = (Double.parseDouble(precio)) * 2;

        JOptionPane.showMessageDialog(null, "Total: " + total);
    }
}
