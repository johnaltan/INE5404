import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Ticker implements ActionListener{
  Container1 c;

  public Ticker(Container1 c){
    this.c = c;
  }

  public void actionPerformed(ActionEvent e){
    c.tick();
  }
}
