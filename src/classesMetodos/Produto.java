package src.classesMetodos;

public class Produto {

    String nome;
    double preco;
 static double desconto = 0.25;

    Produto (String nomeInicial) {
        nome = nomeInicial;
    } Produto (String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoFinal () {
        return preco * (1 - desconto);
    }
}
