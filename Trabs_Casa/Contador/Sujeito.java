import javax.swing.*;

interface Sujeito{
    public void cadastrarObservador(Observador observador);
    public void notificar(); 
}