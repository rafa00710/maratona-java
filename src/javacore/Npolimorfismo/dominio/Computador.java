package javacore.Npolimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.20;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override // Alt + Insert = Override Methods
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.valor * IMPOSTO_POR_CENTO ;
    }

}
