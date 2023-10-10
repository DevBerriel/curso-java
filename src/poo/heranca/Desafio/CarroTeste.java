package src.poo.heranca.Desafio;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Civic();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1);

        Ferrari c2 = new Ferrari();
        c2.acelerar();
        c2.acelerar();
        c2.ligarTurbo();
        c2.acelerar();
        c2.acelerar();
        c2.ligarAr();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        System.out.println(c2);
    }
}
