package org.example.orientacaoobjetos.associacao.exercicio.test;

import org.example.orientacaoobjetos.associacao.exercicio.Aluno;
import org.example.orientacaoobjetos.associacao.exercicio.Local;
import org.example.orientacaoobjetos.associacao.exercicio.Professor;
import org.example.orientacaoobjetos.associacao.exercicio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das pedras");
        Aluno aluno = new Aluno("Guilherme", 19);
        Professor professor = new Professor("Afonso", "Fisíca");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Como a gravidade age", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};


        professor.setSeminarios(seminariosDisponiveis);
        professor.Imprime();
    }
}
