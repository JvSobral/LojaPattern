package alura.java.estudos.loja.desconto;

import alura.java.estudos.loja.desconto.CalculadoraDeDesconto;
import alura.java.estudos.loja.imposto.CalculadoraDeImpostos;
import alura.java.estudos.loja.imposto.ICMS;
import alura.java.estudos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento1 = new Orcamento(new BigDecimal("1000"), 6);

        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        System.out.println(calculadora.calcular(orcamento));
        System.out.println(calculadora.calcular(orcamento1 ));
    }
}
