
package Controller;


import Janelas.PessoaFrame;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JOptionPane;


public class PessoaListener implements ActionListener{
    
        private  PessoaFrame pessoa;
                
      public PessoaListener (PessoaFrame frame){
          this.pessoa = frame;
      }
      
      public void actionPerformed(ActionEvent e){
          
        if ("sair".equals(e.getActionCommand())){
            pessoa.dispose();
        }
        else if ("salvar".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(pessoa, "Clicou em salvar!");
        }
        else if("excluir".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(pessoa, "Clicou em excluir!");
        }
          }
      }
