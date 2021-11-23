package academy.OlaRafa.maratonajava.Introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades [0] = 21;
        idades [1] = 35;
        idades [2] = 7;
       // System.out.println(idades[2]);
        for ( int i = 0; i < idades.length; i++ ) {
            System.out.println(idades[i]);

        }
    }
}
