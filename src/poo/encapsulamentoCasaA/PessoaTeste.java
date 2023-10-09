package src.poo.encapsulamentoCasaA;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria Joana", "Queiroz", 3);


        System.out.println(p1.getIdade());
        System.out.println(p1);
        System.out.println(p1.getNomeCompleto());
    }
}
