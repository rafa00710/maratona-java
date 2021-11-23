package javacore.Lclassesabstratas.dominio;

public class Desenvolvedor  extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override // Alt + Insert - Override metodos e seleciona o calculo que foi criado
    public void calculaBonus() {
        super.calculaBonus();
        this.salario = this.salario + this.salario * 0.5;

    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
