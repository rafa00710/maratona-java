package javacore.Oexcecao.Excecao.Teste;

import java.io.File;
import java.io.IOException;

public class ExcecaoTeste01 {
    public static void main(String[] args) {
        criarNovoArquivo();

    }

    private static void criarNovoArquivo(){ // Criando arquivos
        File file = new File("site\\teste.txt");
        try {
            boolean criado = file.createNewFile();
            System.out.println("Arquivo criado "+criado);

        }catch (IOException e){
            e.printStackTrace();

        }


    }
}
