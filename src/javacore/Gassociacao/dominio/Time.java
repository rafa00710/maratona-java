package javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private jogador[] jogadores ;

    public Time(String nome, jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public Time(String nome) {
        this.nome = nome;
    }
    public void imprime(){
        System.out.println(this.nome);
        if (jogadores == null) return;
        for ( jogador jogador : jogadores ) {
            System.out.println(jogador.getNome());
        }

    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
