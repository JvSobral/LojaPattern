package alura.java.estudos.loja.pedido;

import alura.java.estudos.loja.orcamento.Orcamento;
import alura.java.estudos.loja.pedido.acao.EnviarEmailPedido;
import alura.java.estudos.loja.pedido.acao.SalvaPedidoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int qtdeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int qtdeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdeItens = qtdeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQtdeItens() {
        return qtdeItens;
    }

    public void executa(){
        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.qtdeItens);
        Pedido pedido = new Pedido(cliente,LocalDateTime.now(),orcamento);

        EnviarEmailPedido email = new EnviarEmailPedido();
        SalvaPedidoBancoDeDados salvar = new SalvaPedidoBancoDeDados();


    }
}
