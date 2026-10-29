public class InfoAmbiente {
    public static void main(String[] args){

        System.out.println("Sistema Operacional: " + System.getProperty("os.name"));
        System.out.println("Versão do Java: " + System.getProperty("java.version"));
        System.out.println("Diretorio Atual: " + System.getProperty("user.dir"));

    }
}