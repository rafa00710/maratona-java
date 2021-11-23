package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;


public class EstudanteTest02 {
    public static void main(String[] args) {


        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();


        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Goku";
        estudante02.idade = 45;
        estudante02.sexo = 'F';

        estudante03.nome = "Rafa";
        estudante03.idade = 35;
        estudante03.sexo = 'M';



        estudante01.imprime();
        estudante02.imprime();
        estudante03.imprime();


    }
}
