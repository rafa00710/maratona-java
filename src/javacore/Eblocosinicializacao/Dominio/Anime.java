package javacore.Eblocosinicializacao.Dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaço em mémoria pro projeto
    // 2 - Cada atributo de classe é criado e inicializado com valores
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for ( int i = 0; i < episodios.length ; i++ ) {
            episodios[i] = i+1;

        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {



        for ( int episodio : this.episodios ) {
            System.out.println(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
