import java.awt.*;

//solucao colocada por razoes didaticas
//outra solucao ("melhor", mais tarde) usando padrao observador (MVC)  
class FigRetangulo extends Retangulo implements Reproduzivel {

  FigRetangulo(Ponto a, Ponto b) {
    super(a,b);
  }
  public void reproduzir(Graphics g) {
    g.drawRect(this.x0(),this.y0(),this.largura(),this.altura());
  }
  
}
