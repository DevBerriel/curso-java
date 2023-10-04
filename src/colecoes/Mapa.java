package src.colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<Integer, String>();

        usuarios.put(1, "Maria Joana");  // .put adicionar em fila e substitui caso exista
        usuarios.put(2, "Rayssa");
        usuarios.put(3, "Denilson");
        usuarios.put(4, "Valeria");

        System.out.println(usuarios.size());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsValue("Maria Joana"));
        System.out.println(usuarios.containsKey(4));
        System.out.println(usuarios.get(3));

        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor: usuarios.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()) {

            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }

    }
}
