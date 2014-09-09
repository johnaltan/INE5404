class Retangulo implements Deslocavel{
  Ponto a,b;
  public void deslocarX(int val){
    a.deslocarX(val);
    b.deslocarX(val);
  }
  public void deslocarY(int val){
    a.deslocarY(val);
    b.deslocarY(val);
  }
}
