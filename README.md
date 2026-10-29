# TP1 - Fundamentos de Desenvolvimento com Java

Este repositório reúne as atividades do Trabalho Prático 1 (TP1) da disciplina de Fundamentos de Desenvolvimento com Java. Os exercícios foram desenvolvidos como parte do aprendizado inicial da linguagem Java, utilizando programas simples, registros de terminal, anotações e capturas de tela.

## Objetivos de aprendizado

- Conhecer a estrutura básica de um programa Java.
- Compilar e executar arquivos `.java` pelo terminal.
- Entender a relação entre código-fonte, bytecode, JVM e arquivo `.class`.
- Praticar variáveis, operadores, condicionais, repetição, métodos e menus.
- Utilizar o JShell para testar pequenos trechos de código.

## Tecnologias utilizadas

- Java (o projeto está configurado no IntelliJ IDEA para Temurin 21).
- IntelliJ IDEA.
- Terminal do macOS e JShell.
- Git e GitHub.

## Exercícios

| Exercício | Arquivo principal | Assunto principal |
|---|---|---|
| 1 | `InfoAmbiente.java` | Informações do sistema operacional, Java e diretório atual. |
| 2 | `exercicio2.txt` | Explicação sobre `.java`, `.class`, `javac` e JVM. |
| 3 | `Sessao Terminal.txt` e registros do JShell | Uso de Java 21, JShell, variáveis e operadores. |
| 4 | `Exercicio4.java` e `exercicio4.txt` | Idade mínima, comparação e estudos sobre Java. |
| 5 | `ConversorUnidades.java` | Conversão de temperatura e distância. |
| 6 | `ClassificadorPedido.java` | Classificação de pedidos por peso. |
| 7 | `ClassificadorPedido2.java` | Repetição, contadores e valor sentinela. |
| 8 | `MenuLogistica.java` e `MenuLogistica2.java` | Menu com `do-while`, `switch` e métodos. |
| 9 | `MenuLogisticaFinal.java` | Versão final do menu Tabajara Logistica. |

## Estrutura de pastas

```text
TP1-Fundamentos-de-Desenvolvimento-com-Java/
├── README.md
├── .gitignore
├── src/
├── Exercicio 1/
├── Exercicio 2/
├── Exercicio 3/
├── Exercicio 4/
├── Exercicio 5/
├── Exercicio 6/
├── Exercicio 7/
├── Exercicio 8/
├── Exercicio 9/
└── Anexo/
```

Os arquivos Java reunidos em `src/` são os fontes principais do projeto. Cada pasta `Exercicio N` também mantém os arquivos correspondentes à entrega daquele exercício, como cópias dos programas, textos, registros do terminal e imagens. A pasta `Anexo` contém explicações complementares sobre JShell e sobre a seleção do Java 21 em diferentes sistemas operacionais.

## Como compilar

No diretório raiz do projeto, compile todos os arquivos Java para uma pasta temporária:

```bash
javac -encoding UTF-8 -d .verificacao/classes src/*.java
```

Os arquivos `.class` gerados ficam em `.verificacao/classes` e não são enviados ao repositório.

## Como executar

Depois da compilação, execute o programa desejado informando o classpath:

```bash
java -cp .verificacao/classes InfoAmbiente
java -cp .verificacao/classes Exercicio4
java -cp .verificacao/classes ConversorUnidades
java -cp .verificacao/classes ClassificadorPedido
java -cp .verificacao/classes ClassificadorPedido2
java -cp .verificacao/classes MenuLogistica
java -cp .verificacao/classes MenuLogistica2
java -cp .verificacao/classes MenuLogisticaFinal
```

Para conferir a versão ativa do Java antes de compilar, use:

```bash
java -version
javac -version
```

## Tabajara Logistica

Os exercícios 8 e 9 desenvolvem um menu chamado **Tabajara Logistica**. Ele reúne conversão de temperatura, conversão de distância e classificação de pedidos por peso. A versão final, em `MenuLogisticaFinal.java`, também apresenta uma opção **Sobre**, que informa a versão do Java utilizada durante a execução.

Na classificação dos pedidos, o programa considera pedidos leves até 5 kg, padrão acima de 5 kg até 20 kg e urgentes acima de 20 kg. Pesos negativos são tratados como inválidos. O valor `-99` é usado para encerrar a entrada de pedidos nos programas que utilizam repetição.

## JShell

O JShell foi usado nos exercícios para experimentar declarações de variáveis e operações simples sem criar uma classe completa. Os registros dessa prática estão principalmente em `Exercicio 3/`, e há uma explicação complementar em `Anexo/explicacao-jshell.txt`.

## Uso de IA no aprendizado

Durante o desenvolvimento, a IA foi utilizada como ferramenta de apoio aos estudos, para esclarecer dúvidas e ajudar na compreensão de conceitos como escopos, métodos e reutilização de código. As sugestões foram analisadas e testadas ao longo dos exercícios.
