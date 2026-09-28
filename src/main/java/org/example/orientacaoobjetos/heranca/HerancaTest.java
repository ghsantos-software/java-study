package org.example.orientacaoobjetos.heranca;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 12");
        endereco.setCep("123");
        Pessoa pessoa = new Pessoa("Pessoa 1");
        pessoa.setCpf("123456789");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("--------------");

        Funcionario funcionario = new Funcionario("Funcionario 1");
        funcionario.setCpf("12324234234");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
