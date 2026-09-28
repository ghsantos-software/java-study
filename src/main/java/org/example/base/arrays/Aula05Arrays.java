package org.example.base.arrays;

public class Aula05Arrays {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '/u0000' '   '
        // boolean false
        // String null

        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 31;
        idades[2] = 22;

        System.out.println(idades[0]);

        String[] nomes = new String[4];
        nomes[0] = "Pedro";
        nomes[1] = "Guilherme";
        nomes[2] = "Lucas";
        nomes[3] = "Marcos";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        int[] numeros = new int [3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};

        for (int num : numeros3) {
            System.out.println(num);
        }

    }
}
