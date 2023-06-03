package alura.java.estudos.loja.desconto;

import alura.java.estudos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValorAlto extends Desconto{

    public DescontoValorAlto(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));

    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
