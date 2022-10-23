
package Ejercicio01;


public class Empleado {
    private Persona datosPersonales;
    private String Departamento;

    public Empleado() {
        this.datosPersonales = null;
        this.Departamento = "";
    }

    public Persona getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(Persona datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
    
           
}
