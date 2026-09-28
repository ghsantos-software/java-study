package org.example.orientacaoobjetos.interfaces;

public class DatabaseLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Carrregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    // Não pode recer override
    public static void oiNe(){
        System.out.println("oi né");
    }
}
