package javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override // Utilizando o CRTL + O = evita de usar o IF
        public double calcularDesconto(double valor) {
            return valor * 0.1; // Aqui podemos alterar para o calculo desejado
        }
    } , CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.5;
        }
    };

    public abstract double calcularDesconto (double valor); // abstract subscreve

}
