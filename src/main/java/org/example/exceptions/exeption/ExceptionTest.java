package org.example.exceptions.exeption;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    // Exception é a superclasse geral para eventos anômalos que um programa pode tratar
    // RuntimeException é um erro de lógica não verificado pelo compilador (unchecked)
    // IOException é um erro externo e verificado (checked) ligado a operações de entrada e saída
    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " +isCriado);
//printStackTrace() é um método da classe Throwable (a mãe de todas as exceções) usado para imprimir no console a árvore de chamadas do código que levou até o momento em que o erro aconteceu.
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
