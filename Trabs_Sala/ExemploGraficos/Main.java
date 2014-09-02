import java.awt.*;
import javax.swing.*;

class Main{
  public static void main(String[] args){
    JFrame f = new JFrame();
    
    Container c = new Container1();
    f.setContentPane(c);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setSize(500,400);
    f.setVisible(true);
  }

}
