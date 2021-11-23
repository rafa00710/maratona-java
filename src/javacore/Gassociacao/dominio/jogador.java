package javacore.Gassociacao.dominio;

public class jogador {
    private String nome;
    private Time time;



    public void imprime() { // imprimir
        System.out.println(this.nome); // imprimir os nomes
        if (time != null){
            System.out.println(time.getNome());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
