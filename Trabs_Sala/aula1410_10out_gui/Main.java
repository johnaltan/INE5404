import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main{
    
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
        JPanel c1, c2;
        c1 = new JPanel();
        quadro.add(c1,BorderLayout.NORTH);
        c2 = new JPanel();
        quadro.add(c2,BorderLayout.SOUTH);
        
        TratadorBotao t = new TratadorBotao();
        
        JButton b = new JButton("A");
        b.addActionListener(t);
        b.setActionCommand(b.getText());
        c1.add(b);
        
        b = new JButton("B");
        b.addActionListener(t);
        b.setActionCommand(b.getText());
        c1.add(b);
        
        b = new JButton("C");
        b.addActionListener(t);
        b.setActionCommand(b.getText());
        c1.add(b);
        
        JLabel r = new JLabel("L1");
        c2.add(r);
        
        r = new JLabel("L2");
        c2.add(r);
        
    }
}

class TratadorBotao implements ActionListener{
    
    public void actionPerformed(ActionEvent evt){
        String cmd = evt.getActionCommand();
        System.out.println(cmd);
    }
}