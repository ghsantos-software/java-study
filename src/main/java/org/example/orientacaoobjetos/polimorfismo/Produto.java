package org.example.orientacaoobjetos.polimorfismo;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    public Produto(double valor, String nome) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
