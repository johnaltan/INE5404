import javax.swing.*;

class Contador implements Sujeito{
    private int soma;
    private Observador observador;
    JLabel tela;
    
    public Contador(JLabel tela){
        this.soma = 0;
        this.tela = tela;
    }
    
    public Contador(int soma,JLabel tela){
        this.soma = soma;
        this.tela = tela;
    }
    
    public void cadastrarObservador(Observador observador){
        this.observador = observador;
    }
    
    public void inc(){
        this.soma++;
        observador.atualizar(this);
    }
    
    public void dec(){
        this.soma--;
        observador.atualizar(this);
    }
    
    public void zero(){
        this.soma = 0;
        observador.atualizar(this);
    }
    
    public void modificar(){
        tela.setText(""+soma);
    }
    
    public Contador copia(){
        Contador c = new Contador(this.soma,this.tela);
        c.cadastrarObservador(this.observador);
        observador.atualizar(c);
        return c;
    }
}
