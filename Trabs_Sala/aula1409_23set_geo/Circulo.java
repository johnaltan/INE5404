//import static java.lang.*;

class Circulo extends Ponto {
   private int r;
   Circulo(int x, int y, int raio) {
      super(x,y);
      this.r = raio;
   }
   double area() {
     return Math.PI * r * r;
   }
   int diametro() { return 2 * r;}
   int x0() {
     return this.x0(r);
   }
   int y0() {
     return this.y0(r);
   }
   public String toString() {
     //return r+"@(" + x + "," + y + ")";
     return r+"@" + super.toString();
   }

}//
