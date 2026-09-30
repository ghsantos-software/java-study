package org.example.exceptions.runtime;


import java.io.FileNotFoundException;
import java.sql.SQLException;

//capturando multiplas excessões!! e multi cach em linha com |
public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e){
            System.out.println("dentro do array INOOBE");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do index...");
        }catch (RuntimeException e){
            System.out.println("essa fica em ultima por que é a mais genérica e pai de todas");
        }


        try {
            talvezLanceException();
        }catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("erro mais genérico");
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
