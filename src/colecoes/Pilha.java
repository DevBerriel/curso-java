package src.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();

        livros.add("Makaveli");
        livros.push("Don Quixote");
        livros.push("Fluminense 121 anos");

        System.out.println(livros);
        System.out.println(livros.peek());
        System.out.println(livros.element());

        

    }
}
