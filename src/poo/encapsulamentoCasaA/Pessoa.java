package src.poo.encapsulamentoCasaA;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;


    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);

    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // getters
    public int getIdade() {
        return idade;
    }

    // setters
    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120)
        this.idade = novaIdade;
    }
    public String toString() {
        return "Olá eu sou a " + getNome() + " e tenho " + getIdade() + " anos.";
    }

}
