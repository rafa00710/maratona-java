package javacore.Gassociacao.Teste;

import javacore.Gassociacao.dominio.jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {

        jogador jogador1 = new jogador("Pelé");
        jogador jogador2 = new jogador("Romário");
        jogador jogador3 = new jogador("Cafu");

        jogador[] jogadores = {jogador1, jogador2, jogador3}; // array

        for ( jogador jogador : jogadores ) { // for para imprimir
            jogador.imprime();

        }

    }

}
