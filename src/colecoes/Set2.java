package src.colecoes;

import java.util.HashSet;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
        lista.add("Maria Joana");
        lista.add("Rayssa");
        lista.add("Valéria");
        lista.add("Denilson");

        for(String canditado: lista) {
            System.out.println(canditado);
        }


    }
}
