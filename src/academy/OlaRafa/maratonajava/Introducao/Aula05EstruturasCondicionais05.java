package academy.OlaRafa.maratonajava.Introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo

        byte dia = 8;
        // char, int, byte, short, enum, String
        switch (dia) {

            case 1:
                System.out.println("Domingo");
                break; // vamos parar, quando encontrar o dia
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabádo");
                break;

            default: // Quando não houver opção
                System.out.println("Opção inválida");

        }

        String sexo = "M";
        switch (sexo){
            case "M":
                System.out.println("Homem");
                break;
            case "F":
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
