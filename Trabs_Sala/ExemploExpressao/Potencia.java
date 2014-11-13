class Potencia implements Expressao{
    Expressao exp1, exp2;
    
    public Potencia(Expressao exp1, Expressao exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
    
    public double avaliar(){
        return Math.pow(exp1.avaliar(), exp2.avaliar());
    }
    
}