package javacore.Fmodificadorestatico.test;

import javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("BMW" , 280);
        Carro c2 = new Carro("Mercedes", 320);
        Carro c3 = new Carro("Audi", 350);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
