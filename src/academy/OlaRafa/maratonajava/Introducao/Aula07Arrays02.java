package academy.OlaRafa.maratonajava.Introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float, e double 0
        // char
        // boolean false
        // String null

        String [] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Rafa";
        nomes[2] = "Ruan";
        for ( int i = 0; i < nomes.length ; i++ ) {
            System.out.println(nomes[i]);

        }


    }
}
