package org.example.orientacaoobjetos.sobreescrita;

public class Anime {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }
// sobreescreve todo o valor passado dentro de um atributo! chamando somente o valor inicial e ele retorna todos!
    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
