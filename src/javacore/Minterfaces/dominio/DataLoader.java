package javacore.Minterfaces.dominio;

// private -> default -> protected -> public

public interface DataLoader {
    public static final int MAX_DATE_SIZE = 10;
    public abstract void load();
    default void checkPermission(){ // Usamos o default para criar extensão
        System.out.println("Verificando Permissão");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }

}
