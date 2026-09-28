package org.example.base.arrays;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        // são estruturas de dados formadas por arrays de arrays, usados para representar matrizes, tabelas ou grades com linhas e colunas.

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 01;
        dias[0][2] = 12;

        dias[1][0] = 29;
        dias[1][1] = 11;
        dias[1][2] = 8;

        dias[2][0] = 31;
        dias[2][1] = 12;
        dias[2][2] = 98;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("------------------------------");

        for(int[] arrBase: dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
