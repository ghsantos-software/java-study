package org.example.orientacaoobjetos.modificadores;

public class Ferrari extends Carro{
    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
}
