package src.streams;

public class DesafioLibertadores {


    public static void main(String[] args) {

        DesafioTime time1 = new DesafioTime();
        time1.nome = "Fluminense";
        time1.empates = 3;
        time1.vitorias = 7;
        time1.derrotas = 0;
        time1.pontos = time1.vitorias + time1.empates;



        System.out.println(time1.pontos);

    }
}
