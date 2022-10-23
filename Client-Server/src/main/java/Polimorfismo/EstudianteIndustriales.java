
package Polimorfismo;


public class EstudianteIndustriales extends Estudiante{
   @Override
    public int calcularPromedio(){
    notaFinal=((primEx+segmEx+exaFin)/3)+4;
    return notaFinal;
    } 
}
