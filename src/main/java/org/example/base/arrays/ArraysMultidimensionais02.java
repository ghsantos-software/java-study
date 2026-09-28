package org.example.base.arrays;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] datas = new int[3][];

        datas[0] = new int[] { 23, 9, 2026 };
        datas[1] = new int[] { 15, 10, 2026 };
        datas[2] = new int[] { 31, 12, 2026 };

        for (int i = 0; i < datas.length; i++) {
            System.out.println("Data " + (i + 1));
            for (int j = 0; j < datas[i].length; j++) {
                System.out.println(datas[i][j]);
            }
        }

        System.out.println("------------------------------");

        for (int[] data : datas) {
            for (int valor : data) {
                System.out.println(valor);
            }
        }
    }
}

