package src.lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> prod.preco >= 750;

        Produto produto = new Produto("Notebook", 3892.89, 0.15);
        System.out.println(isCaro.test(produto));
    }
}
