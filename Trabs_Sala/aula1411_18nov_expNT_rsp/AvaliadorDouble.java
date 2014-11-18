

class AvaliarDouble implements Avaliador<Double> {
  public Double avaliarNum(int n) {
     return (double)n;
  }
 
  public Double avaliarSoma(Exp e1, Exp e2) {
     return e1.receberAvaliador(this) + e2.receberAvaliador(this);
  }

  public Double avaliarProduto(Exp e1, Exp e2) {
     return e1.receberAvaliador(this) * e2.receberAvaliador(this);
  }

  public Double avaliarInverso(Exp e) {
     return 1 / e.receberAvaliador(this);
  }

}

