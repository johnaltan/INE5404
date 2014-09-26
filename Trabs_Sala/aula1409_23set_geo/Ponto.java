class Ponto implements Deslocavel {
   //private
   int x,y;
   Ponto(int x, int y) {
     this.x = x;
     this.y = y;
   }
   public void deslocarX(int val) {
      x = x + val;
   }
   public void deslocarY(int val){
      y = y + val;
   }


   int x0(int d) {
      return x - d;
   } 

   int y0(int d) {
      return y - d;
   } 

 
   int x0(Ponto q) {
     int x0;
     x0 = this.x;
     if (x0 > q.x) x0 = q.x;
     return x0;
   }

   int y0(Ponto q) {
     int y0;
     y0 = this.y;
     if (y0 > q.y) y0 = q.y;
     return y0;
   }

   int normaX(Ponto q) {
     int normaX;
     normaX = this.x - q.x;
     if(normaX < 0) normaX = -normaX;
     return normaX;
   }

   int normaY(Ponto q) {
     int normaY;
     normaY = this.y - q.y;
     if(normaY < 0) normaY = -normaY;
     return normaY;
   }




   public String toString() {
     return "(" + x + "," + y + ")";
   }
}
