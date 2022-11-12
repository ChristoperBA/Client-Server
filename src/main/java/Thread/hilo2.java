
package Thread;


public class hilo2 extends Thread {
    public String competidor;

    public hilo2(String competidor) {
        this.competidor = competidor;
    }
    @Override
    public void run(){
        for (int i = 1; i <=3; i++)  
        {
            System.out.println("El competidor "+competidor+" acaba de superar el obstaculo"+i);
        }
    
    }
    
    
    
}
