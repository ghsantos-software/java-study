package org.example.classesutilitarias.Strings;

public class StringTest03 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo String : " + (fim - inicio) + "ms");


        inicio = System.currentTimeMillis();
        concatStringBuilder(30000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo builder : " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto +=i ;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i) ;
        }
    }
}

// • Mutabilidade:• String: Cada vez que você modifica uma string (como concatenar textos com +), o sistema cria um novo objeto na memória e descarta o anterior.
//• StringBuilder: Modifica o conteúdo no mesmo espaço de memória alocado, alterando o objeto original.

//• Desempenho:• String: Fica mais lenta e consome mais memória se for alterada muitas vezes em um loop (como em concatenações repetidas).
//• StringBuilder: É muito mais rápido e eficiente para manipulações pesadas, inserções ou muitas concatenações consecutivas.

//• Uso Recomendado:• String: Ideal para textos fixos, pequenos ou que mudam poucas vezes.
//• StringBuilder: Ideal para quando o texto precisa ser alterado, montado ou modificado várias vezes em tempo de execução
