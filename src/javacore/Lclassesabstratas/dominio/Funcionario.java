package javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa { // Abstract fica restrito, ou seja funcionarios tem varios departamentos
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public void calculaBonus() {
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo......");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }



}