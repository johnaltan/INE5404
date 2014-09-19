class Animacao implements Animador{
  private FigRetangulo fig;
  private Reprodutor quadro;

  public Animacao(Reprodutor quadro){
    this.fig = new FigRetangulo(new Ponto(10,10),new Ponto(100,100));
    this.quadro = quadro;
  }

  public void tick(){
    fig.deslocarX(5);
    quadro.addFig(fig);
    quadro.repaint();
  }
}
