import java.awt.*;

//solucao colocada por razoes didaticas
//outra solucao ("melhor", mais tarde) usando padrao observador (MVC)  
class FigPoligono extends Poligono implements Reproduzivel {
  FigPoligono(Ponto[] pontos) {
    super(pontos);
  }
  public void reproduzir(Graphics g) {
    g.drawPolygon(this.verticesX(), this.verticesY(), this.verticesX().length);
  }
  
}
