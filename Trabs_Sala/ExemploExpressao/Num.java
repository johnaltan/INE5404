class Num implements Expressao{
  private double n;

  public Num(double n){
    this.n = n;
  }
  public double avaliar(){
    return n;
  }
}
