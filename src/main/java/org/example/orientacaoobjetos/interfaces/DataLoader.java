package org.example.orientacaoobjetos.interfaces;

public interface DataLoader {
    void load();
    // defaul significaga um metodo adicionado que não obriga as classes filhas a aderir
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    // metodos esticos não podem ser modificados em outras clases

    public static void oiNe(){
        System.out.println("oi né");
    }
}
