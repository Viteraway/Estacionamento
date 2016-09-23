
package Controller;

import Janelas.MotoFrame;
import Janelas.PessoaFrame;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class PessoaListener {
    
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
