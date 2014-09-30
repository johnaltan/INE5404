import java.util.List;
import java.util.ArrayList;
import java.awt.event.MouseEvent;

class Clicador {
  //badcode: dependencia ciclica (cf. aula)
  Clicador(Reprodutor quadro) {
    this.quadro = quadro;
    pontos = new ArrayList<Ponto>();
  }
  private Reprodutor quadro;
  private int q = 0;
  private int x1,y1,x2,y2;
  private List<Ponto> pontos;
  //via algoritmo
  //mais tarde, via padrao "estado"
  void clique(int x, int y) { //System.out.println("("+ x +","+ y +")");
    if(q == 0) {
        quadro.addFig(new FigCirculo(x1=x, y1=y,5));
    }
    if(q == 1) {
    quadro.addFig(new FigCirculo(x2=x, y2=y,5));
    }
    if(q == 2) {
      quadro.addFig(new FigTriangulo(
      new Ponto(x1,y1),
      new Ponto(x2,y2),
      new Ponto(x,y)
    ));
    }
    q = (q+1)%3;
    quadro.repaint();
  }
  
  void clique(MouseEvent e){
    if(e.getButton() == MouseEvent.BUTTON3) q = 1;
    if(q == 0){
      quadro.addFig(new FigCirculo(e.getX(), e.getY(),5));
      pontos.add(new Ponto(e.getX(),e.getY()));
    }
    if(q == 1){
      pontos.add(new Ponto(e.getX(),e.getY()));
      quadro.addFig(new FigPoligono(pontos.toArray(new Ponto[0])));
      pontos.clear();
      q = 0;
    }
    quadro.repaint();
  }

}
