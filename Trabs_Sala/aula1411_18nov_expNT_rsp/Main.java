
class Main {
  public static void main(String[] args){
    Exp e;
    
     e = new Num(5);
     //e = new Soma(new Num(2),new Num(3));
     e = new Soma(new Num(2),e);
     e = new Soma(new Num(2), new Produto(new Num(3), new Num(4)));     
     e = new Soma(new Num(2), new Produto(new Num(3),new Inverso(new Num(7))));     

    AvaliarDouble a = new AvaliarDouble();
    double x = e.receberAvaliador(a);
    System.out.println("x = " + x);   
    
    AvaliarRacional avaliarRacional = new AvaliarRacional();
    Racional r = e.receberAvaliador(avaliarRacional);
    System.out.println("r = " + r);   
    
  }
   
}//
