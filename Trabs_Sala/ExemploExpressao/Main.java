class Main{
  public static void main(String[] args){
    Expressao n2, n3, n4;
    n2 = new Num(2);
    n3 = new Num(3);
    n4 = new Num(4);
    Expressao s23, s234;
    s23 = new Soma(n2,n3);
    s234 = new Mod(n4,s23);
    System.out.println(s234.avaliar());
  }
}
