package org.example.exceptions.exeption;

import org.example.exceptions.exeption.dominio.Funcionario;
import org.example.exceptions.exeption.dominio.LoginInvalidoException;
import org.example.exceptions.exeption.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobresEscritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
