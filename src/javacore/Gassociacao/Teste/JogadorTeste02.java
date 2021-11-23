package javacore.Gassociacao.Teste;

import javacore.Gassociacao.dominio.Time;
import javacore.Gassociacao.dominio.jogador;

public class JogadorTeste02 {
    public static void main(String[] args) {
        jogador jogador1 = new jogador("Rafa");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
