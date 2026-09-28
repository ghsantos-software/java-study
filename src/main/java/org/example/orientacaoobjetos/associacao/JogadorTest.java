package org.example.orientacaoobjetos.associacao;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("CR7");
        Jogador jogador3 = new Jogador("Neymar");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for(Jogador x : jogadores){
            x.Imprime();
        }

// ou
        //System.out.println(jogador1.getNome());
        //System.out.println(jogador2.getNome());
        //System.out.println(jogador3.getNome());

    }
}
