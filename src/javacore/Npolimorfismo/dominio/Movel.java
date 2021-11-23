package javacore.Npolimorfismo.dominio;

public abstract class Movel implements Imposto {
    protected String veiculo;
    protected String marca;
    protected double valor;

    public Movel(String veiculo, String marca, double valor) {
        this.veiculo = veiculo;
        this.marca = marca;
        this.valor = valor;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public String getMarca() {
        return marca;
    }

    public double getValor() {
        return valor;
    }
}
