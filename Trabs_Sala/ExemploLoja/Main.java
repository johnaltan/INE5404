class Main{
    public static void main(String[] args){
        Loja l = new Loja(new Carro[]{
                            new Carro("VW","Gol",1994,20000),
                            new Carro("VW","Up",2014,60000),
                            new Carro("Ford","Ka",2010,18500),
                            new Carro("GM","Celta",2011,30500),
                            new Carro("Fiat","Uno",2014,40000)});
        l.listarEstoque();
    }

}
