class Retangulo implements Deslocavel{
  private Ponto a,b;

  public Retangulo(Ponto a, Ponto b){
    this.a = a;
    this.b = b;
  }

  public int x0(){
    return a.x0(b);
  }

  public int y0(){
    return a.y0(b);
  }

  public int largura(){
    return a.normaX(b);
  }

  public int altura(){
    return a.normaY(b);
  }
  
  public void deslocarX(int val){
    a.deslocarX(val);
    b.deslocarX(val);
  }

  public void deslocarY(int val){
    a.deslocarY(val);
    b.deslocarY(val);
  }
}
