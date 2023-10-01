package src.classesMetodos;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preço = 4200.00;
        p1.desconto = 0.25;


        Produto p2 = new Produto();
        p2.nome = "Celular";
        p2.preço = 1800.00;
        p2.desconto = 0.35;

        System.out.println(p1.nome);
    }
}
