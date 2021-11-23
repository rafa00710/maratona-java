package javacore.Hheranca.dominio;

public class Funcionario extends Pessoa { // Extends = esta buscando todas as
    // informações da classe pessoa


    private double salario;

    static {
        System.out.println("Dentro do bloco inicialização estático de funcionario");
    }
    {
        System.out.println("Dentro do bloco inicialização de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco inicialização de funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprime(){
        super.imprime(); // Super = Esta apenas acrescentando a impressão de salário
        System.out.println(this.salario);

    }

    public void relatorioPagamento (){
        System.out.println("Eu "+ this.nome+" Recebi o salário de "+ this.salario);
    }



    public double getSalario() {
        return salario;
    }



    public void setSalario(double salario) {
        this.salario = salario;
    }
}
