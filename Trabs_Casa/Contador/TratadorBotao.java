import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TratadorBotao implements ActionListener{
    //JLabel tela;
    Contador c, mem;
    
    public TratadorBotao(JLabel tela){
        c = new Contador(tela);
        Mostrador mostrador = new Mostrador(c);
        c.cadastrarObservador(mostrador);
    }
    
    public void actionPerformed(ActionEvent evt){
        String cmd = evt.getActionCommand();
        System.out.println("Comando: " + cmd);
        if(cmd.equals("+")){
            c.inc();
        }
        else if(cmd.equals("-")){
            c.dec();
        }
        else if(cmd.equals("R")){
            c.zero();
        }
        else if(cmd.equals("MS")){
            mem = c.copia();
        }
        else if(cmd.equals("MR")){
            if (mem != null)
                c = mem.copia();
        }
        else if(cmd.equals("MC")){
            mem = null;
        }
    }
}
