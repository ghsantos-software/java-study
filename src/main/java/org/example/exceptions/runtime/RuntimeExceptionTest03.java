package org.example.exceptions.runtime;


// bloco finally
public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
