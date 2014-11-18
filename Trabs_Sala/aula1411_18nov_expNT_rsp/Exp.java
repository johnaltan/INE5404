

interface Exp {
   <U> U receberAvaliador(Avaliador<U> a);
}

interface Avaliador<V> {
   V avaliarNum(int n);
   V avaliarSoma(Exp e1, Exp e2);
   V avaliarProduto(Exp e1, Exp e2);
   V avaliarInverso(Exp e);
}




class Num implements Exp {
  private int n;
  Num(int n) {
     this.n = n;
  }
  public <U> U receberAvaliador(Avaliador<U> a) {
     return a.avaliarNum(n);
  }
}

class Soma implements Exp {
  private Exp e1,e2;
  Soma(Exp e1, Exp e2) {
     this.e1 = e1;
     this.e2 = e2;
  }
  public <U> U receberAvaliador(Avaliador<U> a) {
     return a.avaliarSoma(e1,e2);
  }

}

class Produto implements Exp {
  private Exp e1,e2;
  Produto(Exp e1, Exp e2) {
     this.e1 = e1;
     this.e2 = e2;
  }
  public <U> U receberAvaliador(Avaliador<U> a) {
     return a.avaliarProduto(e1,e2);
  }

}//

class Inverso implements Exp {
  private Exp e;
  Inverso(Exp e) {
     this.e = e;
  }
  public <U> U receberAvaliador(Avaliador<U> a) {
     return a.avaliarInverso(e);
  }

}//
