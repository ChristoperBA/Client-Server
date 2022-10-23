
package Ejercicio01;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
//       Persona persona01= new Persona();
//       persona01.leerDatos();
//       persona01.toString();
//       Persona persona02= new Persona("Waleska",118760495,(byte)21,"Costarricense",170, 60);
//       JOptionPane.showMessageDialog(null, persona02.toString());
//       System.out.println("Hola mundo ");
     
      Empleado empleado01= new Empleado();
      Persona p1= new Persona();
      //return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", estatura=" + estatura + ", peso=" + peso + '}';
      empleado01.setDatosPersonales(new Persona("Tiffany",118760495,(byte)19,"Costarricense",150, 70));
      empleado01.setDepartamento("Ventas");
    }
    
}
