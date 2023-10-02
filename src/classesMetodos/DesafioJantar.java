package src.classesMetodos;

public class DesafioJantar {
    public static void main(String[] args) {

        DesafioComida comida = new DesafioComida("Arroz",0.223);
        DesafioComida comida2 = new DesafioComida("Feijão", 0.300);

        DesafioPessoa pessoa = new DesafioPessoa("Maria", 23.4);
        pessoa.comer(comida);

        System.out.println(pessoa.apresentar());
            pessoa.comer(comida);

        System.out.println(pessoa.apresentar());
           pessoa.comer(comida2);

        System.out.println(pessoa.apresentar());
         pessoa.comer(comida);

        System.out.println(pessoa.apresentar());

    }
}
