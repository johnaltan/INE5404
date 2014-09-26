import java.awt.*;

class FigCirculo extends Circulo implements Reproduzivel {
   FigCirculo(int x, int y, int raio) {
    super(x,y,raio);
  }
  public void reproduzir(Graphics g) {
    g.drawOval(this.x0(),this.y0(),this.diametro(),this.diametro());
  }
  
}
