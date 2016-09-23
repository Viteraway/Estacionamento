
package Controller;


import Janelas.MotoFrame;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JOptionPane;


public class MotoListener implements ActionListener{
    
        private  MotoFrame moto;
                
      public MotoListener (MotoFrame frame){
          this.moto = frame;
      }
      
      public void actionPerformed(ActionEvent e){
          
        if ("sair".equals(e.getActionCommand())){
            moto.dispose();
        }
        else if ("salvar".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(moto, "Clicou em salvar!");
        }
        else if("excluir".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(moto, "Clicou em excluir!");
        }
          }
      }
