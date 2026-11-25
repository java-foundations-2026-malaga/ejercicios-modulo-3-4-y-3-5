package modulo3_4_3_5_actividad19;

import javax.swing.JOptionPane;

public class Actividad19 {
    public static void main(String[] args) throws Exception {
        // TODO: pide nombre y ciudad con JOptionPane y muestra un mensaje final.
        String name = JOptionPane.showInputDialog("name:");
        String city = JOptionPane.showInputDialog("city:");

        JOptionPane.showMessageDialog(null, "Name: " + name + "\nCity: " + city);
    }
}
