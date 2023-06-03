package alura.java.estudos.loja.pedido.acao;

import alura.java.estudos.loja.pedido.Pedido;

public class SalvaPedidoBancoDeDados implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados!");
    }
}
