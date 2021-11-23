package javacore.Oexcecao.Excecao.Teste;

import java.io.File;
import java.io.IOException;

public class ExcecaoTeste02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();

    }

    public static void criarNovoArquivo()  throws IOException { // Criando arquivos
        File file = new File("site\\teste.txt");
        try {
            boolean criado = file.createNewFile();
            System.out.println("Arquivo criado "+criado);

        }catch (IOException e){
            e.printStackTrace();
            throw e;

        }


    }
}
