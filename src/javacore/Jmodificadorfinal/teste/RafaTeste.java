package javacore.Jmodificadorfinal.teste;

import javacore.Jmodificadorfinal.dominio.Rafa;

public class RafaTeste {
    public static void main(String[] args) {

        int contar = 0;
        while (contar <3){
            System.out.println(contar);
            contar = contar +1;
        }

        for ( int i = 0; i < 3; i++ ) {
            System.out.println(i);

        }


        Rafa rafa = new Rafa();
        rafa.setNome("Rafa");
        rafa.setIdade(34);
        rafa.imprime();

        System.out.println("---------");

        Rafa rafa1 = new Rafa();
        rafa1.setNome("Ruan");
        rafa1.setIdade(07);
        rafa1.imprime();

        double contaCorrente = 8000;
        double contaPoupanca = 1.500;
        float playStation = 5000f;

        boolean consigoComprar = contaCorrente > playStation || contaPoupanca > playStation;
        System.out.println(consigoComprar);

        boolean autorizadoaComprarBebida = rafa.getIdade() >= 35;

        if (autorizadoaComprarBebida){
            System.out.println("Autorizado");
        }else {
            System.out.println("Não autorizado");
        }

       int idade2 = 18;
        String categoria;

        categoria = idade2 < 12 ? "Categoria infantil" : idade2 >= 15 && idade2 < 18 ? "Categoria juvenil" :  "Categoria Adulto";
        System.out.println(categoria);

        double salario = 5000;
        double impostoMensal = 10.0 / 100;
        double impostoAnual = 50.0 / 100;
        double imposto = 100 / 100;
        double receita;


        if(salario <= 2000){
            receita = salario * impostoMensal;
        }else if (salario > 2000 && salario <= 4000) {
            receita = salario * impostoAnual;
        } else {
            receita = salario * imposto;

        }

        System.out.println("O total de recita mais salario é: " +(receita+salario));

        byte dia = 2;

        switch (dia){

            case 1:
            case 2: {
                System.out.println("Dia bom");
                break; // para
            }

            case 3:{
                System.out.println("Dia top");
                break;
            }

            default:
                System.out.println("Não existe esta opção");





        }






        }




    }

