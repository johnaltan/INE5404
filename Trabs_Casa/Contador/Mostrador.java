import javax.swing.*;

class Mostrador implements Observador{
    private Contador contador;
    
    public Mostrador(Contador contador){
        this.contador = contador;
    }
    
    public void atualizar(){
        contador.modificar();
    }
}