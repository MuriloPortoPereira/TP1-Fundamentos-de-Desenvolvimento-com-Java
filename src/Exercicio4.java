import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade usuario: ");

        int idade = entrada.nextInt();
        int idadeMinima = 18;

        boolean podeEntrar = idade >= idadeMinima;

        System.out.println("Idade informada: " + idade);
        System.out.println("Pode entrar: " + podeEntrar);

        entrada.close();
    }
}


/*
--------- Conteúdo Sobre: close(), return e System.exit() ---------

Em Java, entrada.close() e return são comandos diferentes.

1. entrada.close() - Fecha o Scanner
O metodo close() serve para fechar o Scanner e liberar os recursos utilizados por ele.

Exemplo:
Scanner entrada = new Scanner(System.in);
int idade = entrada.nextInt();
entrada.close();

Quando utilizamos System.in, estamos recebendo dados
pela entrada padrão do programa, normalmente o teclado.

Ao utilizar entrada.close(), também fechamos o System.in.

Por isso, devemos fechar o Scanner somente quando não
precisarmos mais receber informações.

-------------------------------------------------------------------

2. return - Sai do metodo atual

O return é utilizado para encerrar a execução de um metodo.

Exemplo:

public static void main(String[] args) {
    System.out.println("Olá!");

    return;
}

Nesse exemplo, o programa imprime "Olá!" e depois
encontra o return, encerrando a execução do metodo main.

Se houver instruções depois de um return incondicional
no mesmo bloco, elas serão consideradas inacessíveis.

--------- Diferenças ---------

entrada.close() = Fecha o Scanner.

return;         = Sai do metodo atual.

System.exit(0)  = Solicita o encerramento da JVM.

*/