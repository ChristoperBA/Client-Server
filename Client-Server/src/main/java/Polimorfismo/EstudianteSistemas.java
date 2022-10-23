
package Polimorfismo;


public class EstudianteSistemas  extends Estudiante{
    @Override
    public int calcularPromedio(){
    notaFinal=((primEx+segmEx+exaFin)/3)+3;
    return notaFinal;
    }
}
