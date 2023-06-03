package alura.java.estudos.loja;


import alura.java.estudos.loja.pedido.GeraPedido;
import alura.java.estudos.loja.pedido.acao.EnviarEmailPedido;
import alura.java.estudos.loja.pedido.acao.GeraPedidoHandler;
import alura.java.estudos.loja.pedido.acao.SalvaPedidoBancoDeDados;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class TestePedidos {

    public static void main(String[] args) {
        String cliente = "Cleitin";
        BigDecimal valorOrcamento = new BigDecimal("500");
        int qtdeItens = 3;

        GeraPedido gerador = new GeraPedido(cliente,valorOrcamento,qtdeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvaPedidoBancoDeDados(), new EnviarEmailPedido()));
        handler.execute(gerador);


    }
}
