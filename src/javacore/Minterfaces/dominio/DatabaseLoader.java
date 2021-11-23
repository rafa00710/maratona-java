package javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataRemover, DataLoader { // Implements quando estamos com interface
    @Override // Alt + Enter = implementar metodos
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe DataBaseLoader");
    }
}
