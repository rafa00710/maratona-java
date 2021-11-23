package javacore.Oexcecao.Excecao.Teste;

import javacore.Oexcecao.Excecao.Dominio.Leitor1;
import javacore.Oexcecao.Excecao.Dominio.Leitor2;

import java.io.*;

public class TryWitchResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();

    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {



        }catch(IOException e){
        }
    }
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Teste.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
