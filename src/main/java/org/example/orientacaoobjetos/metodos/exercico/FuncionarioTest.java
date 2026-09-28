package org.example.orientacaoobjetos.metodos.exercico;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Joao";
        funcionario.idade = 44;
        funcionario.setSalarios(new double[]{1,2,3,4,5,6,7,8,9,10});
        funcionario.imprime();}
}
