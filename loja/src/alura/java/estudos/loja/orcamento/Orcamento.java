package alura.java.estudos.loja.orcamento;

import alura.java.estudos.loja.orcamento.situacao.EmAnalise;
import alura.java.estudos.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento extends SituacaoOrcamento {

    private BigDecimal valor;
    private int qtdeItens;
    private SituacaoOrcamento situacao;




    public Orcamento(BigDecimal valor, int qtdeItens) {
        this.valor = valor;
        this.qtdeItens = qtdeItens;
        this.situacao = new EmAnalise();

    }

   public void DescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.descontoExtra(this);

   }


    public void aprovar() {
        this.situacao.aprovar(this);
    }


    public void reprovar() {
        this.situacao.reprovar(this);
    }


    public void finalizar() {
        this.situacao.finalizar(this);

    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQtdeItens() {
        return qtdeItens;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
}
