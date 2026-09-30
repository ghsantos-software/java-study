package org.example.exceptions.exeption;

import org.example.exceptions.exeption.dominio.Leitor1;
import org.example.exceptions.exeption.dominio.Leitor2;

import java.io.*;
// try with resources
public class TryWitchResourcesTest {
    public static void main(String[] args) {
        lerArquivo();

    }
    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
        }catch (Exception e){
        }
    }
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
