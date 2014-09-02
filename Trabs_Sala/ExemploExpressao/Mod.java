class Mod implements Expressao{
  private Expressao e1, e2;
  public Mod(Expressao e1, Expressao e2){
    this.e1 = e1;
    this.e2 = e2;
  }
  public double avaliar(){
    return e1.avaliar() % e2.avaliar();
  }
}
