
package Excepcions;

import javax.swing.JOptionPane;

public class Rutina02 {
    private int primerValor;
    private int segundoValor;
    private double resultado;
    public void leerNumeros(){
        try{
        primerValor=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el primer valor"));
        segundoValor=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el segundo valor"));
        resultado=primerValor/segundoValor;
        JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
        }catch(NumberFormatException ex01){
        JOptionPane.showMessageDialog(null, "Hubo un error de formato "+ex01.getMessage());
        }catch (ArithmeticException ex01){
            JOptionPane.showMessageDialog(null, "Ocurrio un error al dividir"+ex01.getMessage());
        }
    }
}
