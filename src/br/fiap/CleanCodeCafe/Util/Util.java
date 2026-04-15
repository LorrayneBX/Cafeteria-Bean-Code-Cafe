package br.fiap.CleanCodeCafe.Util;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {

    public void menu(){
        int opcao;
        do {
            String aux = "#### Bean & Code Café #### \n";
            aux += "[1] Registrar novo pedido\n ";
            aux += "[2] Adicionar item a um pedido \n";
            aux += "[3] Finalizar pedido \n";
            aux += "[4] Listar pedidos em \n ";
            aux += "[5] Exibir faturamento do dia \n";
            aux += "[6] Sair \n";
            opcao = parseInt(showInputDialog(aux)); //transforma o numero digitado que está em formato text, para int, para podermos trabalhar embaixo

            if (opcao < 1 || opcao > 6){
                showMessageDialog(null,"Opção Inválida");
            }
            else{
                switch (opcao){
                    case 1 -> registrarPedido();
                    case 2 -> adicionarItemPedido();
                    case 3 -> finalizarPedido();
                    case 4 -> listaPedidoAberto();
                    case 5 -> FaturamentoDia();
                    case 6 -> sair();
                }
            }
        }while(opcao != 6);
    }
}
