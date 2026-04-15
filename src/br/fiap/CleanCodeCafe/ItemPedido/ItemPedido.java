package br.fiap.CleanCodeCafe.ItemPedido;

public class ItemPedido {
    private String nomeProduto;
    private double precoUnico;
    private int quantidade;

    public ItemPedido(String nomeProduto, double precoUnico, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.precoUnico = precoUnico;
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoUnico() {
        return precoUnico;
    }

    public void setPrecoUnico(double precoUnico) {
        this.precoUnico = precoUnico;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularSubtotal(){
        double subtotal;
        subtotal = precoUnico * quantidade;

        return subtotal;
    }
    public String getDados(){
        String aux = "";
        aux += "Produto: " + nomeProduto + "\n";
        aux += "Quantidade: " + quantidade + "\n";
        aux += "Unitário: " + precoUnico + "\n";
        aux += "Subtotal: " + calcularSubtotal() + "\n";

        return aux;
    }
}
