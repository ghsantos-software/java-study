package org.example.orientacaoobjetos.polimorfismo2.servico;

import org.example.orientacaoobjetos.polimorfismo2.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando arquivo");
    }
}
