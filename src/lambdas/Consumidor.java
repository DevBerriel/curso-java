package src.lambdas;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        Produto p1 = new Produto("Caneta", 12.34, 0.9);
        imprimir.accept(p1);


        Produto p2 = new Produto("Notebook", 2987.99, 2.5);

        Produto p3 = new Produto("Caderno", 19.90, 1.2);

        Produto p4 = new Produto("Lapís", 4.39, 1.5);

        Produto p5 = new Produto("Borracha", 7.8, 1.9);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
