
package Excepcions;

import javax.swing.JOptionPane;


public class Rutina03 {
   private char letras[] = new char[5];

    public void llenar() {
        int x;
        try {
            for (x = 0; x < 5; x++) {
                letras[x] = JOptionPane.showInputDialog(null,
                        "Digite una letra:").charAt(0);
            }
        } catch (NumberFormatException ex01) {
            JOptionPane.showMessageDialog(null, "¡Error al ingresar la información!");
        } catch (StringIndexOutOfBoundsException ex02) {
            JOptionPane.showMessageDialog(null, "¡No digitó información!");
        }
    }

    public void mostrarDatoPosicion() {
        try {
            int posicion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite la posición del dato que desea ver:"));
            JOptionPane.showMessageDialog(null, "La posición contiene: " + letras[posicion]);
        } catch (NumberFormatException ex03) {
            JOptionPane.showMessageDialog(null, "¡Error al ingresar la información!");
        } catch (ArrayIndexOutOfBoundsException ex04) {
            JOptionPane.showMessageDialog(null, "¡La posición no existe!");
        }
    }
    
}
