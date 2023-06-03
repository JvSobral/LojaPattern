package alura.java.estudos.loja.imposto;

import alura.java.estudos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto{

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
