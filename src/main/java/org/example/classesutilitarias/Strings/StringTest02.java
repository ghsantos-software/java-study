package org.example.classesutilitarias.Strings;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "KKKK";
        String numeros = "012345";
        System.out.println(nome.charAt(3));
        System.out.println(nome.length());
        System.out.println(nome.replace("KKKK", "Gui"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0,3)); // retorna 0 a 2
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0)); // retorno do zero até o final
        System.out.println(numeros.trim()); // remove o espaço em branco
    }
}
