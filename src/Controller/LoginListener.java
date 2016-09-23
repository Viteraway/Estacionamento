
package Controller;

import Janelas.Estacionamento;
import Janelas.LoginFunc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginListener implements ActionListener{
        private LoginFunc frame;

    public LoginListener(LoginFunc frame) {
        this.frame = frame;
    }

    @Override
        public void actionPerformed(ActionEvent e) {
        if ("login".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(null, "Desenvolvido por José Vitor");
            //if(frame.getUsuario().equals("1")){
            //    Estacionamento est = new Estacionamento();
            }
        } 
        
    }
    
