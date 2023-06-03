package alura.java.estudos.loja.orcamento.situacao;

import alura.java.estudos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{

    public BigDecimal descontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}

