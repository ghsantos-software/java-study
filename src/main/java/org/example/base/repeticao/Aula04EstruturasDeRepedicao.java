package org.example.base.repeticao;

public class Aula04EstruturasDeRepedicao {
    public static void main(String[] args) {
        // while, do while, for
        // do-while executa um bloco de código pelo menos uma vez e repete essa execução enquanto uma condição especificada for verdadeira

        int minhaIdade = 2;
        while (minhaIdade < 10) {
            System.out.println(minhaIdade);
            minhaIdade++;
        }

        int i = 1;

        do {
            System.out.println("Número: " + i);
            i++;
        } while (i <= 3);


        for (int d = 0; d < 10; d++) {
            System.out.println("For " + d);
        }


        // imprimindo todos os numeros pares de 0 a 1000000

        for (int j = 0; j < 1000000; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

        // imprimindo os primeiros 25 numeros de um dado valor. Por exemplo, 50.

        int valorMax = 50;
        for (int p = 0; p <= valorMax; p++) {
            if (p > 25) {
                break;
            }
            System.out.println(p);
        }

        // exercício

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }

        double precoTotal = 30000;
        for (int parcela = (int) precoTotal; parcela >= 1; parcela--){
            double valorDaParcela = precoTotal / parcela;
            if(valorDaParcela < 1000){
                continue;
            }
            System.out.println("Parcela " +parcela + "R$ " + valorDaParcela);
        }
    }
}

