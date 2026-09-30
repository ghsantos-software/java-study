package org.example.orientacaoobjetos.polimorfismo2;

import org.example.orientacaoobjetos.polimorfismo2.repositorio.Repositorio;
import org.example.orientacaoobjetos.polimorfismo2.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
