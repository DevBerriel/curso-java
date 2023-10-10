package src.lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {

        Calculo calculo = new Soma();

        Calculo multiplicar = new Multiplicar();

        System.out.println(calculo.executar(2, 3));
        System.out.println(multiplicar.executar(2, 3));
    }
}
