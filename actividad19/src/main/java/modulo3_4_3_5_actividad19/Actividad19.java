package modulo3_4_3_5_actividad19;

import javax.swing.JOptionPane;

public class Actividad19 {
    public static void main(String[] args) throws Exception {
        // TODO: pide nombre y ciudad con JOptionPane y muestra un mensaje final.
    	String nombre = (String)JOptionPane.showInputDialog(null,
    			"Cual es tu nombre?",
    			"Nombre",
    			3,
    			null,
    			null,
    			"Escribe aqui");
    	String ciudad = (String)JOptionPane.showInputDialog(null,
    			"Cual es tu ciudad?",
    			"Ciudad",
    			3,
    			null,
    			null,
    			"Escribe aqui");
    			
    	JOptionPane.showMessageDialog(null,
    			nombre +" "+ ciudad,
    			"Info",
    			3);
    }
}
