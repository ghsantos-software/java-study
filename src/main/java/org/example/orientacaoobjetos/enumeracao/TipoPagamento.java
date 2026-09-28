package org.example.orientacaoobjetos.enumeracao;

public enum TipoPagamento {

    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.5;
        }
    };

    //abstract é necessario sobreescrever a expressão acima, pois ele não aceita nada após
    public abstract double calcularDesconto(double valor);
}
