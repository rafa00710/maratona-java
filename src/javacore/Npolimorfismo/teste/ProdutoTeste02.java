package javacore.Npolimorfismo.teste;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen", 3000);

        Produto produto2 = new Tomate("Bra", 300);

        CalculadoraImposto.calcularImposto(produto);

        System.out.println("---------");

        CalculadoraImposto.calcularImposto(produto2);

       // System.out.println(produto.getNome());
       // System.out.println(produto.getValor());
      //  System.out.println(produto.calcularImposto());
      //  System.out.println("-----------");

      //  Produto produto2 = new Tomate("Argentino", 300);
      //  System.out.println(produto2.getNome());
      //  System.out.println(produto2.getValor());
       // System.out.println(produto2.calcularImposto());



    }
}
