package org.example.orientacaoobjetos.introducao.test;

import org.example.orientacaoobjetos.introducao.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "João";
        professor.sexo = 'M';
        professor.idade = 50;

        System.out.println("Nome: " + professor.nome + " Sexo: " + professor.sexo + " Idade: " + professor.idade);
    }
}
