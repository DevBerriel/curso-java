package src.lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<String, String> empolgado =
                valor -> valor + "!!!!!!!";

        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(32));

        Function<String, String> oResultadoE =
                valor -> "O resultado é: " + valor;

        String resultadoFinal = parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(32);

        System.out.println(resultadoFinal);
    }
}
