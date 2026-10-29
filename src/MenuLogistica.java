import java.util.Scanner;

public class MenuLogistica {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("------------ Tabajara Logistica ------------");
            System.out.println("1 - Converter temperatura");
            System.out.println("2 - Converter distancia");
            System.out.println("3 - Classificar pedido");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opcao: ");

            opcao = entrada.nextInt();

        } while (opcao != 4);

        entrada.close();
    }
}
