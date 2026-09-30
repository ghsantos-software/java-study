package org.example.classesutilitarias.Strings;

// Strings são imutáveis!!!!!!!!!! String builder age direto no espaço em memória

public class StringBuilderTest04 {
    public static void main(String[] args) {
        String nome = "Guilherme Henrique";
        nome.concat(" Java ");
        System.out.println(nome);
        System.out.println(nome.concat(" Java"));

        StringBuilder sb = new StringBuilder("Guilherme Santos");
        sb.append(" Stw " + " Dev");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
