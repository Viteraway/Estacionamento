package Controller;

import Janelas.CarroFrame;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class CarroListener implements ActionListener{
    
        private  CarroFrame carro;
        
      public CarroListener (CarroFrame frame){
          this.carro = frame;
      }
      
      public void actionPerformed(ActionEvent e){
        
          
        if ("sair".equals(e.getActionCommand())){
            carro.dispose();
        }
        else if ("salvar".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(carro, "Clicou em salvar!");
        }
        else if("excluir".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(carro, "Clicou em excluir!");
        }
          }
      }
