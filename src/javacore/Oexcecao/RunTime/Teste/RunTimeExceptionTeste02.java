package javacore.Oexcecao.RunTime.Teste;

public class RunTimeExceptionTeste02 {
    public static void main(String[] args) {

            divisao(25 , 5);

        System.out.println("Codigo Finalizado");



    }
    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento inválido");
        }
        return a / b;

    }

}
