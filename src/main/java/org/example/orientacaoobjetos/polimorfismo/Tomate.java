package org.example.orientacaoobjetos.polimorfismo;

public class Tomate extends  Produto {
    public static final double IMPOSTO_POR_CENTO = 0.11;
    public Tomate(double valor, String nome) {
        super(valor, nome);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto tomate");
        return  this.valor * IMPOSTO_POR_CENTO;
    }
}
