import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Container1 extends Container{
  private Timer r;
  private int x;
  private int y;
  private int limitXLeft = 5;
  private int limitYUp = 25;
  private int limitXRight = 368;
  private int limitYDown = 279;
  private int diameter = 17;
  private int dX = 1;
  private int dY = 1;

  public  Container1(){
    x = limitXLeft;
    y = limitYUp;
    r = new Timer(20,new Ticker(this));
    r.start();
  }
  public void paint(Graphics g){
    super.paint(g);
    g.fillOval(this.x,this.y,diameter,diameter);
    g.drawRect(limitXLeft, limitYUp,limitXRight - limitXLeft + diameter,limitYDown - limitYUp + diameter);
    g.drawRect(limitXLeft + diameter, limitYUp + diameter, limitXRight - limitXLeft - diameter, limitYDown - limitYUp - diameter);
  }
  
  public void tick(){
    if (x < limitXRight && y == limitYUp){
      dX = 1;
      dY = 0;
    }
    else if (x == limitXRight && y < limitYDown){
      dY = 1;
      dX = 0;
    }
    else if (x > limitXLeft && y == limitYDown){
      dX = -1;
      dY = 0;
    }
    else if (x == limitXLeft && y > limitYUp){
      dY = -1;
      dX = 0;
    }
    x += (1 * dX);
    y += (1 * dY);
    this.repaint();
  }
  
}
