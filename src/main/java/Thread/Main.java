
package Thread;

import javax.swing.JOptionPane;


public class Main {

    
    public static void main(String[] args) {
       /*
       hilo competidor1=new hilo(1);
       hilo competidor2=new hilo(2);
       hilo competidor3=new hilo(3);
       competidor1.start();
       competidor2.start();
       competidor3.start();
       */

        int x;
        String nombresCompetidores[]=new String[3];
        for (x=0 ;x<3;x++) {
            nombresCompetidores[x]=JOptionPane.showInputDialog(null,"Digite el nombre del competidor: ");
         }
       hilo2 competidor1=new hilo2(nombresCompetidores[0]);
       hilo2 competidor2=new hilo2(nombresCompetidores[1]);
       hilo2 competidor3=new hilo2(nombresCompetidores[2]);
       competidor1.start();
       competidor2.start();
       competidor3.start();
    }
}