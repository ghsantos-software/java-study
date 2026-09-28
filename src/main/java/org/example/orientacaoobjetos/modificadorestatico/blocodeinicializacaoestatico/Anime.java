package org.example.orientacaoobjetos.modificadorestatico.blocodeinicializacaoestatico;

public class Anime {
    private String nome;
    private static int[] episodios;

    // bloco de inicialização, é executado antes do construtor! e antes da inicialização dos atributos! e apenas 1 VEZ!
    static {
        System.out.println("Dentro do bloco de inicialização!");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        for(int episodio : Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
