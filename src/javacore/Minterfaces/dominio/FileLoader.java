package javacore.Minterfaces.dominio;

public class FileLoader  implements DataLoader, DataRemover{ // interfaces podemos adicionar mais de uma extensão
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo");

    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no arquivo");
    }
}
