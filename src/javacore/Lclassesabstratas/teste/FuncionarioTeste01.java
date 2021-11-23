package javacore.Lclassesabstratas.teste;


import javacore.Lclassesabstratas.dominio.Desenvolvedor;
import javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Rafa", 2000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Rafael", 2000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
