

class AvaliarRacional implements Avaliador<Racional> {
  public Racional avaliarNum(int n) {
     return new Racional(n,1);
  }
 
  public Racional avaliarSoma(Exp e1, Exp e2) {
     Racional
       r1 = e1.receberAvaliador(this),
       r2 = e2.receberAvaliador(this);    
     return  r1.somar(r2);
  }

  public Racional avaliarProduto(Exp e1, Exp e2) {
    Racional
       r1 = e1.receberAvaliador(this),
       r2 = e2.receberAvaliador(this);    
     return  r1.multiplicar(r2);
  }

  public Racional avaliarInverso(Exp e) {
    Racional
       r = e.receberAvaliador(this);
     return  r.inverter();
  }

}

