package org.example.base.condicionais;

public class Aula03EstruturasCondicionais {
    public static void main(String[] args) {
        // estrutura condicional if, else if e else
        // operador ternários ? true : false
        // switch case

        int idade = 20;

        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Você é adulto.");
        } else {
            System.out.println("Você é idoso.");
        }

        // operador ternário

        String resultado = (idade < 18) ? "Você é menor de idade." :
                (idade >= 18 && idade < 65) ? "Você é adulto." :
                "Você é idoso.";
        System.out.println(resultado);

        int numero = 5;
        String parOuImpar = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("O número " + numero + " é " + parOuImpar + ".");

        double nota = 7.5;
        String conceito = (nota >= 9) ? "A" :
                (nota >= 7) ? "B" :
                (nota >= 5) ? "C" :
                "D";
        System.out.println("O conceito da nota " + nota + " é " + conceito + ".");

    }
}
