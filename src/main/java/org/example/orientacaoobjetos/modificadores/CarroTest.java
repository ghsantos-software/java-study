package org.example.orientacaoobjetos.modificadores;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Naruto");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("800");
        ferrari.imprime();
    }
}
