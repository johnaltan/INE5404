import java.awt.*;
import javax.swing.*;

class Reprodutor extends JPanel{
  private Reproduzivel fig[] = new Reproduzivel[8001];
  private int prox = 0;

  void addFig(Reproduzivel fig){
    this.fig[prox++] = fig;
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0;fig[i] != null && i < 8001;i++)
      fig[i].reproduzir(g);
  }
}
