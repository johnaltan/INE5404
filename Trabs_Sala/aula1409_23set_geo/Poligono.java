class Poligono implements Deslocavel {
  private Ponto[] pontos;
  Poligono(Ponto[] pontos) {
   this.pontos = pontos;
  }
  public void deslocarX(int val) {
    for(int i = 0; i < pontos.length;i++) pontos[i].deslocarX(val);
  }
  public void deslocarY(int val) {
    for(int i = 0; i < pontos.length;i++) pontos[i].deslocarY(val);
  } 

  public int[] verticesX(){
    int[] xs = new int[pontos.length];
    for(int i = 0; i < xs.length; i++) xs[i] = pontos[i].x0(0);
    return xs;
  }

  public int[] verticesY(){
    int[] ys = new int[pontos.length];
    for(int i = 0; i < ys.length; i++) ys[i] = pontos[i].y0(0);
    return ys;
  }

   public String toString() {
     return "Poligono (" + pontos.length + " pontos)";
   }

}
