
package Polimorfismo;

public class Figura {
    protected int lado;
    protected int perimetro;

    public Figura() {
        this.lado = 0;
        this.perimetro = 0;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }
    public int calcularPerimetro(){
        perimetro=lado*2;
        return perimetro;
    
    }
    
   
}
