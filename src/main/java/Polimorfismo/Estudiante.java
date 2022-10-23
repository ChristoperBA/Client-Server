
package Polimorfismo;


public class Estudiante {
    protected int primEx;   
    protected int segmEx;
    protected int exaFin;
    protected int notaFinal;

    public Estudiante() {
        this.primEx = 0;
        this.segmEx = 0;
        this.exaFin = 0;
        this.notaFinal = 0;
    }

    public int getPrimEx() {
        return primEx;
    }

    public void setPrimEx(int primEx) {
        this.primEx = primEx;
    }

    public int getSegmEx() {
        return segmEx;
    }

    public void setSegmEx(int segmEx) {
        this.segmEx = segmEx;
    }

    public int getExaFin() {
        return exaFin;
    }

    public void setExaFin(int exaFin) {
        this.exaFin = exaFin;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
    public int calcularPromedio(){
        notaFinal=(primEx+segmEx+exaFin)/3;
        return notaFinal;
    }

}
