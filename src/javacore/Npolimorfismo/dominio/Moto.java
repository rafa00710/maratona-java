package javacore.Npolimorfismo.dominio;

public class Moto extends Movel{
    public static final double IMPOSTO = 0.50;
    public Moto(String veiculo, String marca, double valor) {
        super(veiculo, marca, valor);
    }

    @Override
    public double calcularImpostoSobreVeiculos() {
        System.out.println("calcular Imposto Sobre Moto");
        return this.valor * IMPOSTO;
    }
}
