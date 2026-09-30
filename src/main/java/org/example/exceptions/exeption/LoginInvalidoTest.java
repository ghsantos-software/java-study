package org.example.exceptions.exeption;

import org.example.exceptions.exeption.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest {
    public static void main(String[] args) {
        try {
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Sasuke";
        String passwordDB = "1234";
        System.out.println("Usuario");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String passwordDigitado = teclado.nextLine();
        if (usernameDB.equals(usernameDigitado) || passwordDB.equals(passwordDigitado)){
            throw new LoginInvalidoException("Usuario ou senha invalido");

        }

        System.out.println("usuario logado com sucesso");
    }
}
