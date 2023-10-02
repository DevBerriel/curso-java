package src.classesMetodos;

public class DesafioPessoa {
    String nome;
    double peso;

    DesafioPessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    String comer(DesafioComida Desafiocomida) {
        if (Desafiocomida != null) {
            this.peso += Desafiocomida.peso;
        }
        return null;
    }

    String apresentar( ) {
        return "Olá eu sou o " + nome + " e tenho " + peso + " Kgs.";
    }
}
