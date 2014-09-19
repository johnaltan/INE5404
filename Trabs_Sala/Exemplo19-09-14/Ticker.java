import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Ticker implements ActionListener{
  Animador c;

  public Ticker(Animador c){
    this.c = c;
  }

  public void actionPerformed(ActionEvent e){
    c.tick();
  }
}
