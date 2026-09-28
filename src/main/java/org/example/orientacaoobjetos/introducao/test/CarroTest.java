package org.example.orientacaoobjetos.introducao.test;

import org.example.orientacaoobjetos.introducao.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ano = 1980;
        carro.cor = "vermelho";
        carro.marca = "Fiat";

        System.out.println("\n Meu carro: " + carro.marca
                + "\n Da cor: " + carro.cor +
                "\n É do ano: " + carro.ano);
    }
}
