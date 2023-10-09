package src.poo.heranca.Desafio;

public class Ferrari extends Carro{

    Ferrari() {
        super(315);
    }
    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15;
    }
//    @Override
//    void acelerar() {
//       velocidadeAtual += 15;
//    }
}
