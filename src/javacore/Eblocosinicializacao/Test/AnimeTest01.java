package javacore.Eblocosinicializacao.Test;

import javacore.Eblocosinicializacao.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for ( int episodio : anime.getEpisodios() ) {
            System.out.print(episodio + " ");
        }

    }
}
