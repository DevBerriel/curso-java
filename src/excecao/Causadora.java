package src.excecao;

public class Causadora {
    public static void main(String[] args) {
        metodoA(null);

    }
    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }

    }
    static void metodoB(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("O aluno está nulo");
        }
        System.out.println(aluno.nome);
    }
}
