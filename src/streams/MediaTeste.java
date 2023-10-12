package src.streams;

public class MediaTeste {
    public static void main(String[] args) {

        Media m2 = new Media().adidionar(9.4).adidionar(7.8);

        Media m1 = new Media().adidionar(8.3).adidionar(6.7);

        System.out.println(Media.combinar(m1, m2).getValor());


    }
}
