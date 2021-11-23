package javacore.Hheranca.teste;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

public class Herancateste01 {
    public static void main(String[] args) {



        Endereco endereco = new Endereco();

        endereco.setRua("Rua 3");
        endereco.setCep("38415-453");


        System.out.println("-------------");

        Pessoa pessoa = new Pessoa("Rafa");


        pessoa.setCpf("073.527.506.81");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("-------------");

        Funcionario funcionario = new Funcionario("Goku");


        funcionario.setCpf("0111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500.00);
        funcionario.imprime();

        System.out.println("-------------");



    }
}
