class Loja{
    private Carro[] estoque;

    public Loja(Carro[] estoque){
        this.estoque = estoque;
    }

    public void listarEstoque(){
        for(Carro c : estoque) c.listar();
    }

}
