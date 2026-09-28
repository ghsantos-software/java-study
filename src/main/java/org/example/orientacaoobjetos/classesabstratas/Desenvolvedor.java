package org.example.orientacaoobjetos.classesabstratas;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    // sobrescrita onde passe alt+ins+override e chamei calcula salario
    @Override
    public void calculaBonus() {
        this.salario += this.salario * 0.4;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
