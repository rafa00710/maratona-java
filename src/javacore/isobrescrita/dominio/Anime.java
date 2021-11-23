package javacore.isobrescrita.dominio;

public class Anime {
    private String nome;

    @Override
    public String toString() { // Metodo para subescrever
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

