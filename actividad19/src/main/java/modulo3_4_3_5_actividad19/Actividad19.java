package modulo3_4_3_5_actividad19;

import javax.swing.JOptionPane;

public class Actividad19 {
    public static void main(String[] args) throws Exception {
        // TODO: pide nombre y ciudad con JOptionPane y muestra un mensaje final.
    	
    	/*
    	 *  
        int total = Integer.parseInt(precio) * 2;

        JOptionPane.showMessageDialog(null, "Total: " + total);
        Usa al menos dos showInputDialog y un showMessageDialog.
    	 */
    	
    	String entrada = JOptionPane.showInputDialog("Nombre:");
    	String entrada1 = JOptionPane.showInputDialog("Ciudad:");
    	
    	JOptionPane.showMessageDialog(null, "Confirma tis datos " + entrada+ ";" + entrada1);
    }
}
