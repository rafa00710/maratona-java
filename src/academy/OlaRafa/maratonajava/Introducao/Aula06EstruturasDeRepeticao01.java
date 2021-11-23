package academy.OlaRafa.maratonajava.Introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // While, do while, for
        int count = 0;
        while (count < 10){
            System.out.println(count);
            count = count + 1;
        }

        count = 0;
        do {
            System.out.println("Dentro do do-While" + ++count);
        } while (count < 10);

        for ( int i=0; i < 10; i++ ){
            System.out.println("For "+i);
        }
    }
}
