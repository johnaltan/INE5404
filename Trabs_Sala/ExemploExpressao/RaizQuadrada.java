class RaizQuadrada implements Expressao{
    Expressao exp;
    
    public RaizQuadrada(Expressao exp){
        this.exp = exp;
    }
    
    public double avaliar(){
        return Math.sqrt(exp.avaliar());
    }
    
}