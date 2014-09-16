import java.awt.*;
import javax.swing.*;

class Main{
  public static void main(String[] args){
    JFrame janela = new JFrame();
    Reprodutor painel = new Reprodutor();

    janela.setContentPane(painel);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    teste1(painel);

    janela.setSize(500,400);
    janela.setVisible(true);
  }

  static void teste1(Reprodutor quadro){
    Reproduzivel fig;
    fig = new FigRetangulo();
    quadro.addFig(fig);
    quadro.repaint();
  }
}

  
