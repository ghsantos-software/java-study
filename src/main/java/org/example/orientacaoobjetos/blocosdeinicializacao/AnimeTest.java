package org.example.orientacaoobjetos.blocosdeinicializacao;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("DAN DAN DAN");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
