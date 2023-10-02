package src.classesMetodos;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println(a + " " + b);

        Data data = new Data(1, 6, 2022);

        Data data2 = data;

        data.dia = 31;
        data2.mes = 12;
        data.ano = 2025;

        System.out.println(data.dataFormatada());
        System.out.println(data2.dataFormatada());
    }
}
