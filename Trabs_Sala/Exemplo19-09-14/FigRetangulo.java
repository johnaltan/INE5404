class FigRetangulo extends Retangulo implements Reproduzivel{
   
  public FigRetangulo(Ponto a, Ponto b){
    super(a,b);
  }

  public void reproduzir(java.awt.Graphics g){
    g.drawRect(this.x0(),this.y0(),this.largura(),this.altura());
  }
}
