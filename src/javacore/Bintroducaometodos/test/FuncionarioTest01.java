package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Rafa");
        funcionario.setIdade(35);
        funcionario.setSalarios(new double[]{2.500,2.500});
        funcionario.imprime();
        System.out.println("Média " + funcionario.getMedia());



    }
}
