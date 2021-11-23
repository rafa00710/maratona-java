package academy.OlaRafa.maratonajava.Introducao;

public class Aula04Operadores {

    public static void main(String[] args) {
        //+-/*

        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01/numero02;
        System.out.println(resultado);

        //%
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("Dez e Maior que Vinte = "+isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        // && (AND) || (or) !
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaleiMaiorqueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMeorque = idade < 30 && salario >= 3381;
        System.out.println("Maior que trinta = "+ isDentroDaleiMaiorqueTrinta);
        System.out.println("Menor que trinta = "+ isDentroDaLeiMeorque);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 100;
        float valorPlaystation = 5000f;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);
        
        // = += -= *= /= %=
        
        double bonus = 1800;
        bonus += 2000; //3800
        bonus *= 2; // 7600
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;
        --contador;
        int contador2 = 0;

        System.out.println(++contador2);


}
}



