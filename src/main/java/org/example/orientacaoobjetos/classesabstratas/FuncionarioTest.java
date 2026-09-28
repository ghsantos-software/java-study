package org.example.orientacaoobjetos.classesabstratas;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Toji", 10000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Maria", 5000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
