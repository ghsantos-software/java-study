package org.example.orientacaoobjetos.associacao;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Guilherme");
        Jogador jogador2 = new Jogador("Caio");
        Time time = new Time ("Seleção Brasileira");
        Time time2 = new Time ("França");


        System.out.println("Primeiro colocado:");
        jogador1.setTime(time);
        jogador1.Imprime();

        System.out.println("\nSegundo colocado:");

        jogador2.setTime(time2);
        jogador2.Imprime();
    }
}
