import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

class Reprodutor extends JPanel implements MouseListener {
  private List<Reproduzivel> fig;
  private int prox = 0;

  Reprodutor() {
    this.addMouseListener(this);
    clicador = new Clicador(this);
    fig = new ArrayList<Reproduzivel>();
  }
  private Clicador clicador;
  public void mouseClicked(MouseEvent e) {
    clicador.clique(e);
  } 
  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}

  void addFig(Reproduzivel fig) {
    this.fig.add(fig);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    for(Reproduzivel fig : this.fig) {
      if(fig != null)
      fig.reproduzir(g);
    }
    
  }




}
