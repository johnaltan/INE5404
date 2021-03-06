
class Retangulo implements Deslocavel {
   private Ponto a,b;//pontos opostos
   Retangulo(Ponto a, Ponto b) {
     this.a = a;
     this.b = b;
   }
   public void deslocarX(int val) {
      a.deslocarX(val);
      b.deslocarX(val);
   }
   public void deslocarY(int val){
      a.deslocarY(val);
      b.deslocarY(val);
   }
 
   
   int x0() { return a.x0(b);}
   int y0() { return a.y0(b);}
   int largura() { return a.normaX(b);}
   int altura()  { return  a.normaY(b);}

   public String toString() {
     return "Retangulo(" + a + "," + b + ")";
   }

}
