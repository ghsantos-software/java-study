package org.example.orientacaoobjetos.metodos.test;

import org.example.orientacaoobjetos.metodos.dominio.Estudante;
import org.example.orientacaoobjetos.metodos.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Pedro";
        estudante01.idade = 23;
        estudante01.sexo = 'M';

        estudante02.nome = "Paula";
        estudante02.idade = 25;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
