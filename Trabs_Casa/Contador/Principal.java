import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Principal{
    
    public static void main(String[] args){
        JFrame f = new JFrame();
        JPanel quadro = new JPanel();
        f.setContentPane(quadro);
        
        teste1(quadro);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
    
    static void teste1(JPanel quadro){
        //quadro.setPreferredSize(new Dimension(400,500));
        quadro.setLayout(new BorderLayout());
        JPanel c1, c2, c3;
        JButton bSoma, bSubtr, bReset;
        JButton bMS, bMR, bMC;
        JLabel tela;
        TratadorBotao t;
        
        c1 = new JPanel();
        c2 = new JPanel();
        c3 = new JPanel();
        tela = new JLabel("0");
        bSoma = new JButton("+");
        bSubtr = new JButton("-");
        bReset = new JButton("R");
        bMS = new JButton("MS");
        bMR = new JButton("MR");
        bMC = new JButton("MC");
        t = new TratadorBotao(tela);
        
        quadro.add(c1,BorderLayout.NORTH);
        quadro.add(c2,BorderLayout.CENTER);
        quadro.add(c3,BorderLayout.SOUTH);
        
        c1.add(tela);
        
        bSoma.addActionListener(t);
        bSoma.setActionCommand(bSoma.getText());
        c2.add(bSoma);
        
        bSubtr.addActionListener(t);
        bSubtr.setActionCommand(bSubtr.getText());
        c2.add(bSubtr);
        
        bReset.addActionListener(t);
        bReset.setActionCommand(bReset.getText());
        c2.add(bReset);
        
        bMS.addActionListener(t);
        bMS.setActionCommand(bMS.getText());
        c3.add(bMS);
        
        bMR.addActionListener(t);
        bMR.setActionCommand(bMR.getText());
        c3.add(bMR);
        
        bMC.addActionListener(t);
        bMC.setActionCommand(bMC.getText());
        c3.add(bMC);
    }
}
