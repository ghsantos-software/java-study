package org.example.orientacaoobjetos.enumeracao;

public enum TipoCliente {
    PESSOA_FISICA(1, " Pessoa Física"),
    PESSOA_JURIDICA(2, " Pessoa Juridica");

    private final int valor;
    private final String nomeRelatorio;

        TipoCliente(int valor, String nomeRelatorio) {
            this.valor = valor;
            this.nomeRelatorio = nomeRelatorio;
        }


// 1 - O método deu um values() (pegou a lista de todo mundo: PESSOA_FISICA e PESSOA_JURIDICA).
//
//2 - Ele entrou no for e pegou o primeiro cara: PESSOA_FISICA.
//
//3 - Aí ele fez: tipoCliente.getNomeRelatorio(). O que tem guardado nesse atributo dentro da PESSOA_FISICA? Exatamente a String "Pessoa Fisica".
//
//4 - Aí ele comparou: "Pessoa Fisica".equals("Pessoa Fisica").
//
//5 - BINGO! Deu true. O método então deu um return tipoCliente;.

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }
}

