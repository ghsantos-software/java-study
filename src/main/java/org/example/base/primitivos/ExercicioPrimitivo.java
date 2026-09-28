package org.example.base.primitivos;

public class ExercicioPrimitivo {
        public static void main(String[] args) {
            String nome = "Maria";
            String endereco = "Rua das Flores, 123";
            double salario = 3500.75;
            String dataRecebimento = "01/01/2024";
            String relatorio = "Eu " + nome + ", residente em " + endereco + ", recebo um salário de R$ "
                    + salario + " e fui admitido em " + dataRecebimento + ".";

            System.out.printf("%s", relatorio);

            // System.out.println("Eu "+ nome + ", residente em " + endereco + ", recebo um salário de R$ " + salario + " e fui admitido em " + dataRecebimento + ".");
        }
}
