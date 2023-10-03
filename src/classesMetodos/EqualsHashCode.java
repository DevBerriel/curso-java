package src.classesMetodos;

import java.util.Date;

public class EqualsHashCode {
    public static void main(String[] args) {
        EqualsUsuario u1 = new EqualsUsuario();
        u1.nome = "Maria Joana";
        u1.email = "mariajoana@teamo.com";

        EqualsUsuario u2 = new EqualsUsuario();
        u2.nome = "Rayssa Brasil";
        u2.email = "rayssabrasil@teamo.com";


        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
        System.out.println(u1 == u1);
        System.out.println(u2.equals(new Date()));


    }
}
