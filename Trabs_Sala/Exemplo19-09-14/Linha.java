class Linha implements Deslocavel{
  Ponto a,b;

  Linha(Ponto a, Ponto b){
    this.a = a;
    this.b = b;
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
