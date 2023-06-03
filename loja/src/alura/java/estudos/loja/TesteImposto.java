package alura.java.estudos.loja;

import alura.java.estudos.loja.imposto.CalculadoraDeImpostos;
import alura.java.estudos.loja.imposto.ICMS;
import alura.java.estudos.loja.imposto.ISS;
import alura.java.estudos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}
