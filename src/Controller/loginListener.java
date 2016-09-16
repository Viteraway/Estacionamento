
package Controller;

import Janelas.Estacionamento;
import Janelas.LoginFunc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



public class loginListener implements ActionListener {
        
      private  LoginFunc frame;
        
      public loginListener (LoginFunc frame){
      
          this.frame = frame;
      }
      
      public void actionPerformed(ActionEvent e){
          
          if("login".equals(e.getActionCommand())){
          
              JOptionPane.showMessageDialog(null, "Teste....");
             frame.jButton1
          }
      
      
      }
    
}
