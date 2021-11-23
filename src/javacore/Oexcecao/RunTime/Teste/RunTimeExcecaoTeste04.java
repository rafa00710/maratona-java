package javacore.Oexcecao.RunTime.Teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExcecaoTeste04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");


        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException ");
        }

        try { // Alt + Enter = Surrond
            talvezLanceExcecao();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

    }


private static void talvezLanceExcecao() throws SQLException, IOException {

}



}
