package src.poo.encapsulamentoCasaB;

import src.poo.encapsulamentoCasaA.Ana;

public class Pedro extends Ana{



    void testeAcessos() {
        System.out.println(todosSabem); // public
        System.out.println(formaDeFalar); // protected via herança

    }
}
