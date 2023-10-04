package src.colecoes;

import java.util.Objects;

public class ListaUsuario {
    String nome;

    ListaUsuario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListaUsuario that = (ListaUsuario) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
