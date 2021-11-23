package javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização e executado quando a JVM carregar classe
    // 1 - Alocado espaço em mémoria pro projeto
    // 2 - Cada atributo de classe é criado e inicializado com valores
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização1");
        episodios = new int[100];
        for ( int i = 0; i < episodios.length ; i++ ) {
            episodios[i] = i+1;

        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização2");

    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {



        for ( int episodio : Anime.episodios ) {
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
