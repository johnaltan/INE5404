import java.util.Arrays;

public class TesteInicializacao{
  public static void main(String[] args) throws Exception{
    int[] jjjj = {1,2,3,4,5};
    imprimeArray(jjjj);
  }
  
  private static void imprimeArray(int[] array) throws Exception{
    long timestamp;
    System.out.println("Inicio algoritmo 1");
    timestamp = System.nanoTime();
    
    String out = new String("[");
    for(int c : array) out = out + c + ",";
    out = out.substring(0,out.lastIndexOf(','));
    out = out + "]";
    System.out.println(out);
    
    timestamp = System.nanoTime() - timestamp;    
    System.out.println("Termino 1, tempo: " + String.valueOf(timestamp) + " ns");
    System.out.println("Inicio algoritmo 2");
    timestamp = System.nanoTime();
    
    System.out.print("[");
    for(int i = 0; i < array.length - 1; i++) System.out.print(array[i] + ",");
    System.out.print(array[array.length - 1] + "]\n");
    timestamp = System.nanoTime() - timestamp;
    
    System.out.println("Termino 2, tempo: " + String.valueOf(timestamp) + " ns"); 
    
    System.out.println("Inicio algoritmo 3");
    timestamp = System.nanoTime();
    
    System.out.print("[");
    for(int i = 0; i < array.length - 1; i++) {
      System.out.print(array[i]);
      System.out.print(",");
    }
    System.out.print(array[array.length - 1]);
    System.out.print("]\n");
    timestamp = System.nanoTime() - timestamp;
    
    System.out.println("Termino 3, tempo: " + String.valueOf(timestamp) + " ns");
    
    System.out.println("Inicio algoritmo 4");
    timestamp = System.nanoTime();
    
    System.out.println(Arrays.toString(array));
    
    timestamp = System.nanoTime() - timestamp;
    System.out.println("Termino 4, tempo: " + String.valueOf(timestamp) + " ns");
  }

}
