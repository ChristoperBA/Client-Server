
package Polimorfismo;

import javax.swing.JOptionPane;


public class Main {

   
    public static void main(String[] args) {
//      Figura figura01=new Cuadrado();
//      Figura figura02=new Triangulo();
//      figura01.setLado(Integer.parseInt(
//      JOptionPane.showInputDialog(null,"Ingresa el lado del cuadrado")));
//      figura02.setLado(Integer.parseInt(
//      JOptionPane.showInputDialog(null,"Ingresa el lado del triangulo")));
//      JOptionPane.showMessageDialog(null, "Perimetro del Cuadrado es de: "+figura01.calcularPerimetro()+"\n"+"Perimetro del Triangulo es de: "+figura02.calcularPerimetro());
        Estudiante e01= new EstudianteIndustriales();
        Estudiante e02= new EstudianteSistemas();
        e01.setPrimEx(Integer.parseInt(JOptionPane.showInputDialog(null,"Primer examen")));
        e01.setSegmEx(Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo examen")));
        e01.setExaFin(Integer.parseInt(JOptionPane.showInputDialog(null,"Final examen")));
        
        e02.setPrimEx(Integer.parseInt(JOptionPane.showInputDialog(null,"Primer examen")));
        e02.setSegmEx(Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo examen")));
        e02.setExaFin(Integer.parseInt(JOptionPane.showInputDialog(null,"Final examen")));
        
        JOptionPane.showMessageDialog(null,"La nota final del estudiante 1 es de: "+e01.calcularPromedio()
                +"\nLa nota final del estudiante 2 es de: "+e02.calcularPromedio());
    }
    
}
