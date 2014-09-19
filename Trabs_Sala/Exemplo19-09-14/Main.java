import java.awt.*;
import javax.swing.*;

class Main{
  public static void main(String[] args){
    JFrame janela = new JFrame();
    Reprodutor painel = new Reprodutor();

    janela.setContentPane(painel);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //teste1(painel);
    new Timer(250,new Ticker(new Animacao(painel))).start();

    janela.setSize(500,400);
    janela.setVisible(true);
  }
/*
  static void teste1(Reprodutor quadro){
    FigRetangulo fig;
    fig = new FigRetangulo(new Ponto(10,10),new Ponto(100,100));
    fig.deslocarX(100);
    quadro.addFig(fig);
    quadro.repaint();
  }*/
}
