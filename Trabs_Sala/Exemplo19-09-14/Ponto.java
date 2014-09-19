class Ponto implements Deslocavel{
  private int x, y;

  public Ponto(int x, int y){
    this.x = x;
    this.y = y;
  }
  
  public int normaY(Ponto p){
    int ret = y - p.y;
    if(ret < 0) ret = 0 - ret;
    return ret;
  }

  public int normaX(Ponto p){    
    int ret = x - p.x;
    if(ret < 0) ret = 0 - ret;
    return ret;
  }

  public int x0(Ponto p){
    return (x < p.x ? x : p.x);
  }

  public int y0(Ponto p){
   return (y < p.y ? y : p.y);    
  }

 
  public void deslocarX(int val){
    x += val;
  }

  public void deslocarY(int val){
    y += val;
  }

}
