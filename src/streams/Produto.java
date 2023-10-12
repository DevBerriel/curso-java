package src.streams;

public class Produto {

    final String nome;
    final double preco;
    final double desconto;
    final double precoFrete;

    public Produto(String nome, double preco, double desconto, double precoFrete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.precoFrete = precoFrete;
    }
}
