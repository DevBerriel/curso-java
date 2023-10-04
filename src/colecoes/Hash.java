package src.colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<ListaUsuario> listaUsuarios = new HashSet<ListaUsuario>();

        listaUsuarios.add(new ListaUsuario("Ana"));
        listaUsuarios.add(new ListaUsuario("Alfredo"));
        listaUsuarios.add(new ListaUsuario("Alicia"));

        boolean resultado = listaUsuarios.contains(new ListaUsuario("Ana"));
        System.out.println(resultado);

    }
}
