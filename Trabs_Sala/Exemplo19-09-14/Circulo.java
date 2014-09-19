class Circulo extends Ponto{
  private int raio;
  public Circulo(int x, int y, int raio){
    super(x,y);
    this.raio = raio;
  }

  public double area(){
    return Math.PI * Math.pow(this.raio,2);
  }
}
