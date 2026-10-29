import java.util.Scanner;

public class ClassificadorPedido2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contadorInvalido = 0;
        int contadorLeve = 0;
        int contadorPadrao = 0;
        int contadorUrgente = 0;

        double peso;
        while (true) {

            System.out.println("Digite o peso do produto: ");
            peso = entrada.nextDouble();

            if (peso == -99) {
                break;
            }


            if (peso < 0) {

                System.out.println("Peso Invalido");
                contadorInvalido++;

            } else if (peso <= 5) {

                System.out.println("Classificação: Leve ");
                contadorLeve++;

            } else if (peso <= 20) {

                System.out.println("Classificação: Padrão ");
                contadorPadrao++;

            } else {

                System.out.println("Classificação: Urgente");
                contadorUrgente++;

            }

        }

        System.out.println("Total de pedidos invalidos: " + contadorInvalido);
        System.out.println("Total de pedidos leves: " + contadorLeve);
        System.out.println("Total de pedidos padrao: " + contadorPadrao);
        System.out.println("Total de pedidos urgentes: " + contadorUrgente);

        entrada.close();
    }
}

