package src.arrays;

import java.util.Arrays;

public class Exercicio1 {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.8;
        notasAlunoA[1] = 4.4;
        notasAlunoA[2] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for (int i = 0; i < 3; i++) {
            total += notasAlunoA[i];
        }

        System.out.println(total / 3);
    }
}
