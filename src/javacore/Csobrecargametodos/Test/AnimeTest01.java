package javacore.Csobrecargametodos.Test;

import javacore.Csobrecargametodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon 2", "Tv", 12, "Acão");
        anime.imprime();

    }
}
