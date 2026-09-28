package org.example.base.operadores;

public class Aula2Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos: +, -, *, /, %
        // Operadores de atribuição: =, +=, -=, *=, /=, %=
        // Operadores de comparação: ==, !=, >, <, >=, <=
        // Operadores lógicos: &&, ||, !

        int a = 10;
        double b = 3.5;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto da divisão: " + (a % b));


        boolean isDezMaiorQueCinco = 10 > 5; // true
        boolean isDezMenorQueCinco = 10 < 5; // false
        boolean isDezIgualACinco = 10 == 5; // false
        boolean isDezDiferenteDeCinco = 10 != 5; // true

        System.out.println("10 é maior que 5 " + isDezMaiorQueCinco);
        System.out.println("10 é menor que 5 " + isDezMenorQueCinco);
        System.out.println("10 é igual a 5 " + isDezIgualACinco);
        System.out.println("10 é diferente de 5 " + isDezDiferenteDeCinco);


        int idade = 29;
        float salario = 3500f;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);;
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);


        double bonus = 1800;

        bonus += 1000; // bonus = bonus + 1000
        bonus -= 1000; // bonus = bonus - 1000
        bonus *= 2; // bonus = bonus * 2
        bonus /= 2; // bonus = bonus / 2

        System.out.println(bonus);


        int contador = 0;
        contador++; // contador = contador + 1
        contador--; // contador = contador - 1
        ++contador; // contador = contador + 1 a diferença é que o ++contador incrementa antes de usar o valor, enquanto contador++ incrementa depois de usar o valor
        --contador; // contador = contador - 1
        System.out.println(contador);
    }
}
