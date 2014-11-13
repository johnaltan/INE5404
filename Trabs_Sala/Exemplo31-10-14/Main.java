import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.OutputStream;
import java.io.*;

class Main{
  public static void main(String[] args) throws Exception{
    PrintStream original = System.out;
    PrintStream nullOut = new PrintStream(new OutputStream() {
                public void write(int b) {
                    //DO NOTHING
                }
            });
    BufferedReader tentativa = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("[sudo] password for aluno: ");
    System.err.print("gra");
    System.setOut(nullOut);
//    System.setIn(new InputStream);
    while(!args[0].equals(tentativa.readLine())){
      original.println("BURRO, NÃO SABE A SENHA.");
      original.print("[sudo] password for aluno: ");
    }
    return;
  }
}
