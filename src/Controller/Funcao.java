
package Controller;

import Janelas.CarroFrame;
import Janelas.Estacionamento;
import Janelas.MotoFrame;
import Janelas.PessoaFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Funcao implements ActionListener{
        private Estacionamento frame;

    public Funcao(Estacionamento frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("carro".equals(e.getActionCommand())) {
            CarroFrame c = new CarroFrame();
            c.setVisible(true);   
        } 
        else if ("moto".equals(e.getActionCommand())) {
            MotoFrame m = new MotoFrame();
            m.setVisible(true);
        }
        else if ("pessoa".equals(e.getActionCommand())) {
            PessoaFrame p = new PessoaFrame();
            p.setVisible(true);
        } 
        else if ("sobre".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(null, "Desenvolvido por José Vitor");
        }
    }
}


