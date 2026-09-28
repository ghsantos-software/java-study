package org.example.orientacaoobjetos.polimorfismo;

import jdk.swing.interop.SwingInterOpUtils;

public class Televisao extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Televisao(double valor, String nome) {
        super(valor, nome);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisão");
        return this.getValor() * IMPOSTO_POR_CENTO;
    }
}
