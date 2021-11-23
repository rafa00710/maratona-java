package javacore.Gassociacao.Teste;

import javacore.Gassociacao.dominio.Aluno;
import javacore.Gassociacao.dominio.Local;
import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Ruas Do Dobrado");
        Aluno aluno = new Aluno("Rafa", 35);
        Professor professor = new Professor("Goku", "Desenvolvedor");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Ficar Rico", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();



    }
}
