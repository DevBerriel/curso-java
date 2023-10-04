package src.colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<ListaUsuario> lista = new ArrayList<>();

        ListaUsuario u1 = new ListaUsuario("Maria Joana");

        lista.add(u1);
        lista.add(new ListaUsuario("Rayssa"));
        lista.add(new ListaUsuario("Valeria"));
        lista.add(new ListaUsuario("Denilson"));
        lista.add(new ListaUsuario("Davidson"));

        System.out.println(lista.get(3).nome);

        lista.remove(2);
        lista.remove(new ListaUsuario("Davidson"));

        for (ListaUsuario u: lista) {
            System.out.println(u.nome.toString());
        }

    }

}
