import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

class Reprodutor extends JPanel implements MouseListener, ElementoClique {
  private List<Reproduzivel> fig;
  private int prox = 0;

  Reprodutor() {
    this.addMouseListener(this);
    clicador = new Clicador();
    fig = new ArrayList<Reproduzivel>();
  }
  
   void aceita(VisitanteClique visitante){
      visitante.visite(this);
  }  

  public void mouseClicked(MouseEvent e) {
    //clicador.clique(e);
      clicador.visite(this);
    
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
