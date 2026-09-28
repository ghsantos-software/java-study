package org.example.orientacaoobjetos.polimorfismo.servico;

import org.example.orientacaoobjetos.polimorfismo.Produto;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Ralatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " +produto.getNome());
        System.out.println("Preço: " +produto.getValor());
        System.out.println("Imposto a ser pago: " +imposto);
    }
}