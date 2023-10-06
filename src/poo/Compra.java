package src.poo;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adiciocarItem(Item item) {
        itens.add(item);
        item.compra = this;
    }

    double ValorTotal() {
        double total = 0;
        for (Item item: itens){
            total += item.quantidade * item.preco;
        }
        return total;
    }
}