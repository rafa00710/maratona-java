package javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome; // protected pode ser usado apenas no pacote
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco inicialização estático de pessoa");
    }
    {
        System.out.println("Dentro do bloco inicialização de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco inicialização de pessoa 2");
    }

    public Pessoa(String nome){// construtor
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }




    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " Cep: "+this.endereco.getCep());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


}
