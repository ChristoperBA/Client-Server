
package Excepcions;

import javax.swing.JOptionPane;


public class Rutina {
    private int primerValor;
    private int segundoValor;
    private double resultado;
    public  void calcularDivision() {
    int error=0;
    do{
        try{
            primerValor=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el primer valor"));
            segundoValor=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el segundo valor"));
            resultado=primerValor/segundoValor;
            JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
            error=0;
        }catch (ArithmeticException ex01){
            error=1;
            JOptionPane.showMessageDialog(null, "Ocurrio un error al dividir"+ex01.getMessage());
        }
        catch (NullPointerException ex02){
            error=1;
            JOptionPane.showMessageDialog(null, "Datos no fueron ingresados correctamente"+ex02.getMessage());
        }

        
    }while(error!=0);
    }
}
