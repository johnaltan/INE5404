class Triangulo implements Deslocavel{
  private Ponto a,b,c;//pontos vertice
  Triangulo(Ponto a, Ponto b, Ponto c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public void deslocarX(int val) {
    a.deslocarX(val);
    b.deslocarX(val);
    c.deslocarX(val);
  }
  public void deslocarY(int val){
    a.deslocarY(val);
    b.deslocarY(val);
    c.deslocarY(val);
  }

  public int[] verticesX(){
    return new int[]{a.x0(0),b.x0(0),c.x0(0)};    
  }

  public int[] verticesY(){
    return new int[]{a.y0(0),b.y0(0),c.y0(0)};    
  }
 
  public String toString() {
    return "Triangulo(" + a + "," + b + "," + c + ")";
  }
}
