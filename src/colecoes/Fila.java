package src.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Maria Joana");
        fila.offer("Denilson");
        fila.offer("Rayssa");
        System.out.println(fila);

        System.out.println(fila.peek());  // retorna null se a fila estiver vazia
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());


    }
}
