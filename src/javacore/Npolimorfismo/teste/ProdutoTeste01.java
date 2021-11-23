package javacore.Npolimorfismo.teste;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {

        Computador computador = new Computador("Dell", 5000);



        Televisao televisao = new Televisao("Samsung 50\" ", 2000);

        CalculadoraImposto.calcularImposto(computador);

        System.out.println("-----------------");



        CalculadoraImposto.calcularImposto(televisao);
    }
}
