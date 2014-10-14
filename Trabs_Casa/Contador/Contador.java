class Contador{
    private int soma;
    
    public Contador(){
        this.soma = 0;
    }
    
    public Contador(int soma){
        this.soma = soma;
    }
    
    public void inc(){
        this.soma++;
    }
    
    public void dec(){
        this.soma--;
    }
    
    public void zero(){
        this.soma = 0;
    }
    
    public String amostrar(){
        return Integer.toString(this.soma);
    }
    
    public Contador copia(){
        return new Contador(this.soma);
    }
}
