package src.streams;

import java.util.function.UnaryOperator;

public interface Utilitarios {

    public static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    public static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
    public static UnaryOperator<String> grito = n -> n + "!!!!!!";

}
