
package CollectionsSet;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import javax.swing.JOptionPane;
public class Rutina {
   private Set listaPersona=new HashSet();    
   public void agregar(){
      int x;
      for(x=0;x<3;x++){
          Persona p=new Persona();
          p.setCedula(Long.parseLong(JOptionPane.showInputDialog(null,
                    "Digite la cédula:")));
          p.setNombre(JOptionPane.showInputDialog(null,
                    "Digite el nombre:"));
          listaPersona.add(p);
          JOptionPane.showMessageDialog(null,"Elemento agregado");
      }
   }
   public void mostrarElementos(){
      Iterator<Persona> itP=listaPersona.iterator();
      String s="";
      while(itP.hasNext()){
         s=s+itP.next().getNombre()+"";
      }
      JOptionPane.showMessageDialog(null,"La colección contiene:\n"+
            s);
   }
}
