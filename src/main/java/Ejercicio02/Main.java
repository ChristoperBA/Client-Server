
package Ejercicio02;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
       Carrera.setNombreCarrera(JOptionPane.showInputDialog(null,"Digite el nombre de la Carrera: "));
       Carrera.setDuracion(Byte.parseByte(JOptionPane.showInputDialog(null,"Digite la duracion de la carrera: ")));
       JOptionPane.showMessageDialog(null,"La carrera "+Carrera.getNombreCarrera()+" que se imparte en la "
       +Carrera.UNIVERSIDAD+" cuenta con una duracion de "+Carrera.getDuracion()+ " Anios");
    }
    
}
