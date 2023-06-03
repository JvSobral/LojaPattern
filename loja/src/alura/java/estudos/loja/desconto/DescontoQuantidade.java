package alura.java.estudos.loja.desconto;

import alura.java.estudos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoQuantidade extends Desconto{

    public DescontoQuantidade(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));

    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQtdeItens() > 5;
    }
}
