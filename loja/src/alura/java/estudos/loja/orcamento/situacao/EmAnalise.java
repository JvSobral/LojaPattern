package alura.java.estudos.loja.orcamento.situacao;

import alura.java.estudos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

    public BigDecimal descontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void aprovar (Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }
    public void reprovar (Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }
}
