package org.example.classesutilitarias.Strings;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Guilherme"; // String constant pool, são imutáveis
        String nome2 = "Guilherme";
        nome = nome.concat(" Saune");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Guilherme"); // 1 variavel de referencia, 2 objeto do tipo string, 3 string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
