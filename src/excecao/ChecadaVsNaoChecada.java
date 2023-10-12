package src.excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim!");


    }

    // exceção nao checada
    static void geraErro1(){
       throw new RuntimeException("Ocorreu um erro #01");

    }

    // exceção checada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro #02");

        }

    }


