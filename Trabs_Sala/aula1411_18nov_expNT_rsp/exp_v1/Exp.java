

interface Exp {
   double avaliarDouble();
}


class Num implements Exp {
  private int n;
  Num(int n) {
     this.n = n;
  }
  public double avaliarDouble() {
     return n;
  }
}

class Soma implements Exp {
  private Exp e1,e2;
  Soma(Exp e1, Exp e2) {
     this.e1 = e1;
     this.e2 = e2;
  }
  public double avaliarDouble() {
     return e1.avaliarDouble() + e2.avaliarDouble();
  }
}
