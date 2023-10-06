package src.poo;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "Maria Joana";
        c1.adiciocarItem(new Item("Boneca", 2, 7.50));
        c1.adiciocarItem(new Item("Biscoito", 3, 2.99));
        c1.adiciocarItem(new Item("Suco", 5, 5.0));

        System.out.println(c1.itens.size());
        System.out.println(c1.ValorTotal());

        double total = c1.itens.get(0).compra.itens.get(1).compra.ValorTotal();
        System.out.println("O total é " + total );
    }
}
