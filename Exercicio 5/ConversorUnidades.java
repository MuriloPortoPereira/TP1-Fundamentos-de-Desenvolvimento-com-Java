import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double temperaturaReferencia = 80.0;

        System.out.println("Digite a Temperatura em Celsius: ");
        int temperaturaCelsius = entrada.nextInt();

        System.out.println("Digite a Distancia em KM: ");
        double distanciaKm = entrada.nextDouble();

        entrada.close();

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
}

/*
--------- ESTRUTURA IF / ELSE IF / ELSE ---------

Usada para tomar decisoes no codigo.

if      = Testa a primeira condicao.
else if = Testa outra condicao se a anterior for falsa.
else    = Executa se nenhuma condicao anterior for verdadeira.

Exemplo:

if (temperatura > 80) {
    System.out.println("Acima");
} else if (temperatura < 80) {
    System.out.println("Abaixo");
} else {
    System.out.println("Igual");
}

- O Java verifica de cima para baixo.

- Executa apenas o primeiro bloco verdadeiro.

- O else nao precisa de condicao.


--------- OPERADORES DE COMPARACAO ---------

>   = Maior que.
<   = Menor que.
>=  = Maior ou igual.
<=  = Menor ou igual.
==  = Igual a.
!=  = Diferente de.


--------- ESTRUTURA WHILE ---------

Repete um bloco ENQUANTO a condicao for verdadeira.

Estrutura:

while (condicao) {
    // Codigo repetido
}

Exemplo:

int contador = 1;

while (contador <= 5) {
    System.out.println(contador);
    contador++;
}

Verifica a condicao ANTES de executar. Pode nao executar nenhuma vez.

O Contador++ aumenta o valor em 1. Cuidado com loops infinitos!

--------- ESTRUTURA DO-WHILE ---------

Parecida com while, mas executa primeiro e verifica a condicao depois.

Estrutura:

do {
    // Codigo repetido
} while (condicao);

Exemplo:

int contador = 1;

do {
    System.out.println(contador);
    contador++;
} while (contador <= 5);

Executa PELO MENOS uma vez, verifica a condicao DEPOIS, muito utilizada em menus.

--------- DIFERENCA WHILE / DO-WHILE ---------

while    = Verifica antes de executar.
do-while = Executa antes de verificar.

REGRA:
while    -> Pode executar 0 vezes.
do-while -> Executa pelo menos 1 vez.

--------- BOAS PRATICAS ---------

1. Usar if / else para tomar decisoes.
2. Usar else if para varias possibilidades.
3. Usar while para repeticoes com teste inicial.
4. Usar do-while quando precisar executar ao menos uma vez.
5. Evitar muitos if aninhados.
6. Evitar loops infinitos.

*/