package academy.OlaRafa.maratonajava.Introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se slario > 5000
        double salario = 3000;
        String mensagemDoar = "Vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda nnão tenho condiçoes, mas vou ter!";
        String resultado;
       /* if (salario > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
       */
        System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDoar);
        //System.out.println(resultado);
    }
}
