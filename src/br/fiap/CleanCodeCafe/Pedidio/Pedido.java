package br.fiap.CleanCodeCafe.Pedidio;

import br.fiap.CleanCodeCafe.Cliente.Cliente;
import br.fiap.CleanCodeCafe.ItemPedido.ItemPedido;

public class Pedido {
    private int numeroPedido;
    private Cliente cliente;
    private int index;
    private String status;
    private ItemPedido[] itens;

    public Pedido(int numeroPedido, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.itens = new ItemPedido[20];
        this.index = 0;
        this.status = "ABERTO";
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    //adicionar item em um array com index e impedir se estiver cheio
    public void adicionarItem(ItemPedido item){
        if (index >= itens.length){ //Se o index for igual ou maior → já era, lotou
            System.out.println("Não é possível adicionar: lista cheia");
            return;
        }
        itens[index]=item; //Coloca o item exatamente na posição livre
        index++; //anda para a proxima posição
    }

    //calcular total do valor de itens que estão no arrays
    public double calcularTotal(){
       double total = 0;

       for (int i =0; i< index; i++){
           total += itens[i].calcularSubtotal();
       }
       return total;
    }

    public String getDados(){
        String aux = "";
        aux += "Número do Pedido: " + numeroPedido + "\n";
        aux += "Dados do cliente: " + cliente + "\n";
        for (int i = 0; i < index; i++) {
            aux += itens[i] + "\n";
        }

        aux += "Total: " + calcularTotal() + "\n";

        return aux;
    }


}
