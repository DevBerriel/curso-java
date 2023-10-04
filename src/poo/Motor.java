package src.poo;

public class Motor {

    double fatorInjecao = 1;
    boolean ligado = false;


    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) (fatorInjecao * 3000);
        }
    }
}