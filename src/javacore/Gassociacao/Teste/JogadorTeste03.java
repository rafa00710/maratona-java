package javacore.Gassociacao.Teste;


import javacore.Gassociacao.dominio.Time;
import javacore.Gassociacao.dominio.jogador;

public class JogadorTeste03 {
    public static void main(String[] args) {
        jogador jogador = new jogador("Cafu");
        jogador jogador2 = new jogador("Pelé");
        Time time = new Time("Brasil");
        jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--------------- jogador ------------");

        jogador.imprime();

        System.out.println("--------------- time ------------");

        time.imprime();

    }
}
