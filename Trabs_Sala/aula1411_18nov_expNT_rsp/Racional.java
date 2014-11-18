

class Racional {
  private int n,d;
  Racional(int n, int d) {
    this.n = n;
    this.d = d;
  }

  Racional somar(Racional q) {
   int n = this.n * q.d + this.d * q.n,
       d = this.d * q.d;
   
   return new Racional(n,d);
 
  }

  Racional multiplicar(Racional q) {
   int n = this.n * q.n,
       d = this.d * q.d;
   
   return new Racional(n,d);
 
  }

  Racional inverter() {
   return new Racional(d,n);
  }

  public String toString() {
     return n +"/"+ d;
  }

}


