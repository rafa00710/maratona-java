package javacore.Npolimorfismo.dominio;

public class Carro extends Movel {
    public static final double IMPOSTO = 0.10;
    public Carro(String veiculo, String marca, double valor) {
        super(veiculo, marca, valor);
    }

    @Override
    public double calcularImpostoSobreVeiculos() {
        System.out.println("calcular Imposto Sobre Carro");
        return this.valor * IMPOSTO;
    }
}
