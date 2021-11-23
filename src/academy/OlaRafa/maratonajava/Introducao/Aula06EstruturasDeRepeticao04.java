package academy.OlaRafa.maratonajava.Introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas parcelas ele pode ser parcelado
        // Condição valorParcela >= 1000
        int carro = 50000;
        int valorParcelas = 1000;
        int qtdParcelas = carro / valorParcelas;

        System.out.println("Total de Parcelas = "+ qtdParcelas);

        // Podemos utilizar esta outra maneira

        double valorTotal = 50000;
        for ( int parcela = 1; parcela <= valorTotal ; parcela++ ) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+ parcela +" R$ " + valorParcela);



        }

    }
}
