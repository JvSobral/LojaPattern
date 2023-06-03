package alura.java.estudos.loja.imposto;

import alura.java.estudos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto{

    public BigDecimal calcular(Orcamento orcamernto){
        return orcamernto.getValor().multiply(new BigDecimal("0.1"));
    }
}
