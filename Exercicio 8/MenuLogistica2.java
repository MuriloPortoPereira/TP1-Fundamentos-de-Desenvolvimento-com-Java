import java.util.Scanner;

public class MenuLogistica2 {
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
            switch (opcao) {
                case 1:
                    //System.out.println("Temperatura");
                    converterTemperatura(entrada);
                    break;

                case 2:
                    //System.out.println("Distancia");
                    converterDistancia(entrada);
                    break;

                case 3:
                    //System.out.println("Classificar pedido");
                    classificarPedido(entrada);
                    break;

                case 4:
                    System.out.println("Sair");
                    break;
            }

        } while (opcao != 4); // Mantem o While para fazer a saida do do-while

        entrada.close();
    }

    public static void classificarPedido(Scanner entrada) {

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

        }

    public static void converterTemperatura(Scanner entrada) {

        double temperaturaReferencia = 80.0;

        System.out.println("Digite a Temperatura em Celsius: ");
        int temperaturaCelsius = entrada.nextInt();

        double temperaturaFahrenheit = (temperaturaCelsius * 9.0 / 5.0) + 32;

        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit + "°F");
        System.out.println("Temperatura de referencia: " + temperaturaReferencia + "°F");

        if (temperaturaFahrenheit > temperaturaReferencia) {
            System.out.println("Temperatura acima da referencia");
        } else if (temperaturaFahrenheit < temperaturaReferencia) {
            System.out.println("Temperatura abaixo da referencia");
        } else {
            System.out.println("Temperatura igual a referencia");
        }
    }

    public static void converterDistancia(Scanner entrada) {

        System.out.println("Digite a Distancia em KM: ");
        double distanciaKm = entrada.nextDouble();

        double distanciaMilhas = distanciaKm * 0.621371;

        System.out.println("Distancia em milhas: " + distanciaMilhas + " mi");
    }

    /*

    public static void conversorUnidades(Scanner entrada){

        double temperaturaReferencia = 80.0;

        System.out.println("Digite a Temperatura em Celsius: ");
        int temperaturaCelsius = entrada.nextInt();

        System.out.println("Digite a Distancia em KM: ");
        double distanciaKm = entrada.nextDouble();


        double temperaturaFahrenheit = (temperaturaCelsius * 9.0 / 5.0) + 32;
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit + "°F");

        double distanciaMilhas = distanciaKm * 0.621371;
        System.out.println("Distância em milhas: " + distanciaMilhas + " mi");

        System.out.println( + temperaturaReferencia);

        if (temperaturaFahrenheit > temperaturaReferencia) {
            System.out.println("Temperatura em Fahrenheit está acima da temperatura referencia: " + temperaturaReferencia + "°F");
        } else if (temperaturaFahrenheit < temperaturaReferencia) {
            System.out.println("Temperatura em Fahrenheit está abaixo da temperatura referencia: " + temperaturaReferencia + "°F");
        } else {
            System.out.println("A temperatura é igual a referencia");
        }



    }

*/   // Metodo utilizado para criar a converterTemperatura e Distancia


}


