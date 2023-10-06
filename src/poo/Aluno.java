package src.poo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    String nome;
    List<Curso> cursos = new ArrayList<>();

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Aluno(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return nome;
    }

    Curso obterCursoPorNome(String nome) {

        for (Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

}
