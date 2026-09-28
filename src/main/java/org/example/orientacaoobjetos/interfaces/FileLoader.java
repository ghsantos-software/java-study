package org.example.orientacaoobjetos.interfaces;

public class FileLoader implements DataLoader , DataRemove{
    @Override
    public void load() {
        System.out.println("Carregando os dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados");
    }
}

