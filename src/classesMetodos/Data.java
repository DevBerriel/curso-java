package src.classesMetodos;

public class Data {

    int dia;
    int mes;
    int ano;

    String dataFormatada () {
        return String.format(" %d/%d/%d", dia, mes, ano);
    }

    Data () {
        dia = 13;
        mes = 10;
        ano = 1993;
    }
    Data (int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;

    }
}
