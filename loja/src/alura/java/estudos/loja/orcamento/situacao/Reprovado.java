package alura.java.estudos.loja.orcamento.situacao;

import alura.java.estudos.loja.orcamento.Orcamento;

public class Reprovado extends  SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
