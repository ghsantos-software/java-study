package org.example.orientacaoobjetos.metodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }
    public void subtraiDoisNumeros() {
        System.out.println(21 -2);
    }
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if  (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }
// ou
    public double divideDoisNumeros02(double num1, double num2) {
        if  (num2 == 0) {
            return 0;
        } else {
        return num1 / num2;
        }
    }

    // FOR TRADICIONAL → i representa o ÍNDICE (posição).
// Ex: i = 0 → numeros[0] = 1
//
// FOR-EACH → x representa DIRETAMENTE o VALOR.
// Ex: x = 1, depois x = 2, depois x = 3...
//
// Resumo: tradicional = posição | for-each = valor

    public void somaArr(int[] numeros){
        int soma = 0;
        for (int num : numeros) {
            soma = soma + num;
        }
        System.out.println(soma);
    }

// VarArgs
    // public void somaArr(int[] numeros)
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for  (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
