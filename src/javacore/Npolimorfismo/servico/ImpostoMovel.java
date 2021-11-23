package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Carro;
import javacore.Npolimorfismo.dominio.Moto;

public class ImpostoMovel {
    public static void CalcularImpostoCarro (Carro carro){
        System.out.println("Relatório de imposto do carro");
        double imposto = carro.calcularImpostoSobreVeiculos();
        System.out.println("Carro "+carro.getVeiculo());
        System.out.println("Modelo "+carro.getMarca());
        System.out.println("Valor "+carro.getValor());
        System.out.println("Imposto a ser pago "+imposto);

    }
    public static void CalcularImpostoMoto (Moto moto){
        System.out.println("Relatório de imposto do carro");
        double imposto = moto.calcularImpostoSobreVeiculos();
        System.out.println("Carro "+moto.getVeiculo());
        System.out.println("Modelo "+moto.getMarca());
        System.out.println("Valor "+moto.getValor());
        System.out.println("Imposto a ser pago "+imposto);

    }
}
