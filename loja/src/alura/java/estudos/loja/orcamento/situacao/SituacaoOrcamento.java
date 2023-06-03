package alura.java.estudos.loja.orcamento.situacao;
import alura.java.estudos.loja.DomainException;
import alura.java.estudos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal descontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }
    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser aprovado!");
    }

    public void reprovar (Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser reprovado!");
    }
    public void finalizar (Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser finalizado!");
    }

}
