package academy.OlaRafa.maratonajava.Introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main (String[] args){

        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
        if(isAutorizadoComprarBebida == false){
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
            System.out.println("Fora do if");

    }
}
