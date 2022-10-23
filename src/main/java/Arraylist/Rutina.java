
package Arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Rutina {
    private ArrayList<Integer> arreglo= new ArrayList<Integer>();
    public void agregar(){
    int x;
    for(x=0;x<5;x++){
    int valor=Integer.parseInt(JOptionPane.showInputDialog(null,"valor"));
    arreglo.add(valor);
    }
    }
    public void mostrar(){
    int x;
    for(x=0;x<arreglo.size();x++){
        JOptionPane.showMessageDialog(null, arreglo.get(x));
    }
    }
}
