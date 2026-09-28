package org.example.orientacaoobjetos.introducao.test;

import org.example.orientacaoobjetos.introducao.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        // Estudante = nome da classe; estudante = nome da variável; new Estudante valor (objeto criado)

        Estudante estudante = new Estudante();
        estudante.nome = "Pedro";
        estudante.idade = 23;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
