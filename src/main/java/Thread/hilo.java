
package Thread;

import javax.sound.midi.SysexMessage;


public class hilo extends Thread {
    private int competidor;

    public hilo(int competidor) {
        this.competidor = competidor;
    }
    
    
    @Override
    public void run(){
        for(int x=1;x<=5;x++) {
            System.out.println("El competidor N°"+competidor+"esta pasando por el obstaculo "+x);
        }
        System.out.println("El competidor N°"+competidor+"ha finalizado la carrera");
    }
    
            
}
    
