package javacore.Jmodificadorfinal.dominio;

public class Rafa {
    private String nome;
    private int idade;

    public Rafa() {

    }

    public void imprime(){
        System.out.println(nome);
        System.out.println(idade);
    }

    public Rafa(String nome) {
        this.nome = nome;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
