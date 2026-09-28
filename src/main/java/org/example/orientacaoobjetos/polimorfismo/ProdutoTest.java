package org.example.orientacaoobjetos.polimorfismo;

import org.example.orientacaoobjetos.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador(10000, "Windows");
        Tomate tomate = new Tomate(2, "Maduro");
        Televisao televisao = new Televisao(3000, "Sansung Tv 50\" ");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
