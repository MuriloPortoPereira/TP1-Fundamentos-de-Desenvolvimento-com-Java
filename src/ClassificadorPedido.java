/*

   Limites escolhidos para organizar os pedidos:
   - Ate 5 kg: Leve.
   - Acima de 5 ate 20 kg: Padrao.
   - Acima de 20 kg: Urgente.
   - Pedidos mais pesados recebem maior prioridade de despacho.

*/

import java.util.Scanner;

public class ClassificadorPedido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o peso do produto: ");
        double peso = entrada.nextDouble();

        if (peso < 0) {
            System.out.println("Peso Invalido");
        } else if (peso <= 5) {
            System.out.println("Classificação: Leve ");
        } else if (peso <= 20){
            System.out.println("Classificação: Padrão ");
        } else {
            System.out.println("Classificação: Urgente");
        }

    }
}
