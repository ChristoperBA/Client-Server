
package Ejercicio02;


public class Carrera {
    static final String UNIVERSIDAD="Universidad Fidelitas";
    private static String nombreCarrera;
    private static byte duracion;
    
    public Carrera(){
        Carrera.nombreCarrera="";
        Carrera.duracion=0;
    }

    public static String getNombreCarrera() {
        return nombreCarrera;
    }

    public static void setNombreCarrera(String nombreCarrera) {
        Carrera.nombreCarrera = nombreCarrera;
    }

    public static byte getDuracion() {
        return duracion;
    }

    public static void setDuracion(byte duracion) {
        Carrera.duracion = duracion;
    }
    
    
}
