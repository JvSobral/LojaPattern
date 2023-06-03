package alura.java.estudos.loja.desconto;

import alura.java.estudos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto  {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoQuantidade(
                new DescontoQuantidade(
                        new SemDesconto()));


        return desconto.calcular(orcamento);
    }

}
