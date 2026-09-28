package org.example.orientacaoobjetos.metodos.test;

import org.example.orientacaoobjetos.metodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println();

        calculadora.subtraiDoisNumeros();
        System.out.println();

        calculadora.multiplicaDoisNumeros(10, 20);
        System.out.println();

        double result = calculadora.divideDoisNumeros(90,0);
        System.out.println(result);

        Calculadora calculadora2 = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArr(numeros);
        calculadora.somaVarArgs(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8);
    }
}
