package src.poo.heranca.Desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    private int delta = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }



    void acelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;

        } else {
            velocidadeAtual += getDelta();
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    void frear() {
        if (velocidadeAtual >= delta) {
            velocidadeAtual -= delta;
        } else {
            velocidadeAtual = 0;
                }


        }
        public String toString() {
            return "Velocidade atual é " + velocidadeAtual + "km/h";
    }
}
