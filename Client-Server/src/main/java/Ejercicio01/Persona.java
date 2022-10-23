
package Ejercicio01;

import javax.swing.JOptionPane;

public class Persona {
    private String nombre;
    private long cedula;
    private byte edad;
    private String nacionalidad;
    private float estatura;
    private float peso;

    //Constructor con
    public Persona() {
        this.nombre = "";
        this.cedula = 0;
        this.edad = 0;
        this.nacionalidad = "";
        this.estatura = 0;
        this.peso = 0;
    }

    public Persona(String nombre, long cedula, byte edad, String nacionalidad, float estatura, float peso) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.estatura = estatura;
        this.peso = peso;
    }
    
   
    public void leerDatos(){
     nombre=JOptionPane.showInputDialog(null,"Digite su nombre: ");
     cedula=Long.parseLong(JOptionPane.showInputDialog(null,"Digite su cedula: "));
     edad=Byte.parseByte(JOptionPane.showInputDialog(null,"Digite su edad: "));
     nacionalidad=JOptionPane.showInputDialog(null,"Digite su nacionalidad: ");
     estatura=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite su estatura: "));
     peso=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite su peso: "));
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", estatura=" + estatura + ", peso=" + peso + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
