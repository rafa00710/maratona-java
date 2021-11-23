package academy.OlaRafa.maratonajava.Introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean

        int idade = (int)10000000000l; //Exemplo de cash 'forçando'
        long numwrogrande = 10000000l;
        double salarioDouble = 2000.00d;
        float salarioFloat = 2500.85f;
        byte  idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;
        String  nome = "Rafa"; // String é uma classe, por isso inicia com S maisculo
        System.out.println("A idade é " +idade+" anos");
        System.out.println(verdadeiro);
        System.out.println("Char " + caractere);
        System.out.println(salarioFloat);
        System.out.println("Oi meu nome é " +nome);



    }



}
