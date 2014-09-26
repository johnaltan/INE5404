import java.awt.*;

//solucao colocada por razoes didaticas
//outra solucao ("melhor", mais tarde) usando padrao observador (MVC)  
class FigTriangulo extends Triangulo implements Reproduzivel {
  FigTriangulo(Ponto a, Ponto b, Ponto c) {
    super(a,b,c);
  }
  public void reproduzir(Graphics g) {
    g.drawPolygon(this.verticesX(), this.verticesY(), 3);
  }
  
}
