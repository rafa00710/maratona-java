package javacore.Hheranca.teste;

import javacore.Hheranca.dominio.Funcionario;

public class HerancaTeste02 {

    // 0 - bloco de inicialização da super classe é executada quando a JVM carregar classe pai
    // 1 - bloco de inicialização estática da subclasse é executada quando a JVM carregar classe filha
    // 2 - Alocado espaço em memória pro objeto da superclasse
    // 3 - Cada atributo de superclasse e criado e inicializado com valores defalt ou o quer for passado
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - construtor é executado da superclasse
    // 6 - Alocado espaço em memoria pro objeto da subclasse
    // 7 - Cada atributo de sebclasse é criado e inicializado com valores default ou o quer for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Construtor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Rafa");
    }
}
