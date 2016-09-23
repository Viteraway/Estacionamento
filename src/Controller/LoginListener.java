package Controller;
 
 import Janelas.Estacionamento;
 import Janelas.LoginFunc;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import javax.swing.JOptionPane;
 
 public class LoginListener implements ActionListener {
         
       private  LoginFunc frame;
         
       public LoginListener (LoginFunc frame){
           this.frame = frame;
       }
       
       public void actionPerformed(ActionEvent e){
           if("login".equals(e.getActionCommand())){
               JOptionPane.showMessageDialog(null, "Bem vindo!");
             new Estacionamento().setVisible(true);
           }
           else {
                 JOptionPane.showMessageDialog(null, "Login inválido");
             }
       }
     
 }
