package src.classesMetodos;

public class DataTeste {
    public static void main(String[] args) {

        Data dia = new Data(24, 9, 1993);

        System.out.println(dia.dataFormatada());

        var dia2 = new Data(29,11,2020);

        Data dia3 = new Data();

        System.out.println(dia3.dataFormatada());



        System.out.printf(dia2.dataFormatada());
    }


}
