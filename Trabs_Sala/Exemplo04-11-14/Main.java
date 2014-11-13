import java.util.Arrays;

class Main{
  public static void main(String[] args){
    tPar<String,int[]> p;
    p = new Par<String,int[]>("Olar, ",new int[]{1,2});
    System.out.println(p.pri()+Arrays.toString(p.seg()));
  }
}

interface tPar<E,F>{
  E pri();
  F seg();
}

class Par<E,F> implements tPar<E,F>{
  private E pri;
  private F seg;
  
  public Par(E pri, F seg){
    this.pri = pri;
    this.seg = seg;
  }
  
  public E pri(){
    return this.pri;
  }
  
  public F seg(){
    return this.seg;
  }
}