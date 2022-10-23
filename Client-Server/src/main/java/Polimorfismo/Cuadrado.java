
package Polimorfismo;


public class Cuadrado extends Figura {
    
    @Override
    public int calcularPerimetro(){
    perimetro=lado*4;
    return perimetro;
    }
}
