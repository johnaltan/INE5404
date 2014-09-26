import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Reprodutor extends JPanel implements MouseListener {
  private Reproduzivel[] fig = new Reproduzivel[1000];
  private int prox = 0;

  Reprodutor() {
     this.addMouseListener(this);
    clicador = new Clicador(this);
  }
  private Clicador clicador;
  public void mouseClicked(MouseEvent e) {
    clicador.clique(e.getX(),e.getY());
  } 
  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}

  void addFig(Reproduzivel fig) {
    this.fig[prox++] = fig;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    for(Reproduzivel fig : this.fig) {
      if(fig != null)
      fig.reproduzir(g);
    }
    
  }




}
