package org.example.orientacaoobjetos.polimorfismo2.servico;

import org.example.orientacaoobjetos.polimorfismo2.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memória");
    }
}
