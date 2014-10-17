import javax.swing.*;

class Mostrador implements Observador{
    
    public void atualizar(Sujeito sujeito){
        sujeito.modificar();
    }
}