package src.classesMetodos;

public class DataTeste {
    public static void main(String[] args) {

        Data dia = new Data();
        dia.dia = 24;
        dia.mes = 9;
        dia.ano = 1993;

        System.out.printf(" %d/%d/%d", dia.dia, dia.mes, dia.ano);

        var dia2 = new Data();
        dia2.dia = 29;
        dia2.mes = 11;
        dia2.ano = 2020;

        System.out.printf(" %d/%d/%d", dia2.dia, dia2.mes, dia2.ano);
    }


}
