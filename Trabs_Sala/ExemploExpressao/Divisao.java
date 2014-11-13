class Divisao implements Expressao{
    Expressao exp1, exp2;
    
    public Divisao(Expressao exp1, Expressao exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
    
    public double avaliar(){
        return exp1.avaliar() / exp2.avaliar();
    }
    
}