package alura.java.estudos.loja.imposto;

import alura.java.estudos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
