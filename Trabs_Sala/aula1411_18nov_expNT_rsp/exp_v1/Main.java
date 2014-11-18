
class Main {
  public static void main(String[] args){
    Exp e;
    
     e = new Num(5);
     //e = new Soma(new Num(2),new Num(3));
     e = new Soma(new Num(2),e);
    //e = new Soma(new Num(2), new Produto(new Num(3),new Num(4)));     

    double x = e.avaliarDouble();
    System.out.println("x = " + x);   
    
  }
   
}//
