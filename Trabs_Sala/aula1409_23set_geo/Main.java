import java.awt.*;
import javax.swing.*;

class Main {

  public static void main(String[] args) {
    //teste1();
    JFrame f = new JFrame();
 
    Reprodutor c = new Reprodutor();    
    f.setContentPane(c);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //teste2(c);


    f.setSize(500,400);
    f.setVisible(true);

  }

  static void teste2(Reprodutor quadro) {
    Reproduzivel fig;
     fig = new FigRetangulo(new Ponto(50,100),new Ponto(100,150));
     quadro.addFig(fig);
     fig = new FigRetangulo(new Ponto(150,100),new Ponto(200,150));
     quadro.addFig(fig);
     fig = new FigRetangulo(new Ponto(200,200),new Ponto(300,250));
     quadro.addFig(fig);
     fig = new FigCirculo(100,200,50);
     quadro.addFig(fig);

    
     
     quadro.repaint();
  }
  static void teste1() {
    Deslocavel r = new Retangulo(new Ponto(30,40), new Ponto(100,80));
    System.out.println("r = " + r);    
    r.deslocarX(12);
    System.out.println("r = " + r); 

    Ponto a = new Circulo(3,4,20);

    System.out.println("a = " + a); 
    a.deslocarX(20);
    System.out.println("a = " + a);
    //a.area();

    Circulo s = new Circulo(33,40,50);
    System.out.println("area("+ s +") = " + s.area());
  }


}
