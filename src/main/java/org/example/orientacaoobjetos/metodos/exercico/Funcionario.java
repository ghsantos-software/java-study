package org.example.orientacaoobjetos.metodos.exercico;

public class Funcionario {
    public String nome;
    public int idade;
    private double[] salarios;
    private double media;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (this.salarios == null){
            return;
        }
        for(double salario: salarios){
            System.out.print(salario + " ");
        }
        imprimeMediaSalarial();
    }

    private void imprimeMediaSalarial(){
        if (salarios==null){
            return;
        }
        for(double salario: salarios){
            media += salario;
        }
        media = media / this.salarios.length;
        System.out.println("\nMedia salarial " + media);
    }


    public double[] getSalarios() {
        return salarios;
    }

    public  void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
