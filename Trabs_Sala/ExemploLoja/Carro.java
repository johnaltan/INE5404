class Carro{
    private double preco;
    private int ano;
    private String marca, modelo;

    public Carro(String marca, String modelo, int ano, double preco){
        this.preco = preco;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void listar(){
        System.out.println("Marca = " + marca + "\t Modelo = " + modelo + 
                            "\t Ano = " + ano + "\t Preco = " + preco);
    }

}
