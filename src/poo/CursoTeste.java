package src.poo;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Maria Joana");
        Aluno aluno2 = new Aluno("Rayssa");
        Aluno aluno3 = new Aluno("Denilson");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Spring Bot");
        Curso curso3 = new Curso("AWS Cloud");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno: curso1.alunos) {
            System.out.println("Estou matriculado no curso " + curso1.nome);
            System.out.println("E o meu nome é " + aluno.nome);
            System.out.println();

        }

        System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java completo");
        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.alunos);

        }

    }
}
