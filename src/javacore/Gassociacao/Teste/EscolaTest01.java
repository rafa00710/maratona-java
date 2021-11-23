package javacore.Gassociacao.Teste;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Ruan");
        Professor professor2 = new Professor("Rafa");

        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Museu", professores);

        escola.imprime();

    }
}
