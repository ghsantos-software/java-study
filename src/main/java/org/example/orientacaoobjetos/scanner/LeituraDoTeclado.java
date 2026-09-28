package org.example.orientacaoobjetos.scanner;

import java.util.Scanner;

public class LeituraDoTeclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Obrigado " + nome);
    }
}
