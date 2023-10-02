package src.classesMetodos;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4200.00);


        Produto p2 = new Produto("Celular");
        p2.preco = 1800.00;
        p2.desconto = 0.35;

        System.out.println(p1.nome);

        double precoFinal1 = p1.precoFinal();
        double precoFinal2 = p2.precoFinal();

        System.out.println(precoFinal1);
        System.out.println(precoFinal2);
    }
}
