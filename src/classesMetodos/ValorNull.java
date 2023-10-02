package src.classesMetodos;

public class ValorNull {
    public static void main(String[] args) {

        String s1 = "";

        System.out.println(s1.concat("!!!"));

        Data dia1 = Math.random() > 0.5 ? new Data() : null;

        if (dia1 != null) {
            dia1.mes = 3;
            System.out.println(dia1.dataFormatada());
        }

        String s2 = "Flu";

        System.out.println(s2.concat("???"));
    }
}
