package javacore.Npolimorfismo.teste;

import javacore.Npolimorfismo.dominio.Carro;
import javacore.Npolimorfismo.dominio.Moto;
import javacore.Npolimorfismo.servico.ImpostoMovel;

public class ProdutoTesteVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro("Quatro Rodas", "Hyndai", 36000);
        Moto moto = new Moto("Duas Rodas", "Yamaha", 20000);

        ImpostoMovel.CalcularImpostoCarro(carro);

        System.out.println("-------------");

        ImpostoMovel.CalcularImpostoMoto(moto);
    }
}
