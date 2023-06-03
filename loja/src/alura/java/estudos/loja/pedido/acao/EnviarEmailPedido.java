package alura.java.estudos.loja.pedido.acao;

import alura.java.estudos.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido){
        System.out.println("Enviando email com dados do pedido!");
    }

}
