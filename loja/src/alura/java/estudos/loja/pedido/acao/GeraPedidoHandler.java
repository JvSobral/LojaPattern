package alura.java.estudos.loja.pedido.acao;

import alura.java.estudos.loja.orcamento.Orcamento;
import alura.java.estudos.loja.pedido.GeraPedido;
import alura.java.estudos.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(new BigDecimal(600),4);

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
