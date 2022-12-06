import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
    // Introdução aos operadores:
    // Iniciando pelos operadores matemáticos, como: + - * /
    // Temos também o operador % (chamado de módulo) que retorna o resto de uma divisão;
    
    //Temos os operadores relacionais:
    // Os quais são: > < >= <= 
    // Temos estes: == comparação de igualdade e != comparação se é diferente
    // Um bom exemplo é: if (10 != 2) {} ou seja, executará as linhas de código dentro {}
    
    // Outros operadores:
    // += realiza a adição e após realiza a atribuição;
    // -= realiza a subtração e após realiza a atribuição;
    // *= realiza a multiplicação e após realiza a atribuição;
    // /= realiza a divisão e após realiza a atribuição;
    // %= realiza a operação módulo e atribui após a operação;

    // Temos os operadores lógicos:
    // && função E ou AND, o qual os dois lados devem ser verdadeiros para realizar alguma tarefa e/ou operação;
    // || função OU ou OR, o qual um dos lados deve ser verdadeiro para realizar alguma tarefa e/ou operaçao;
    // !  função NAO ou NOT, o qual inverte o dado que é inserido na comparação lógica;
   
    // Exercício 5 construindo uma calculadora simples
    Scanner scanner = new Scanner(System.in);
    System.out.println("CALCULADORA CIENTÍFICA SUPER MEGA BLASTER MODERNA");
    System.out.print("Insira o primeiro número: ");
    Double primeiroNumero = scanner.nextDouble();
    Double resultado = 0.0;
    String operacao;
    Integer auxiliarPotencia = 0;
    Double auxiliarResultado = 0.0;

    System.out.print("Insira o símbolo da operaçao matemática a ser realizada: ");
    operacao = scanner.next();

    if (operacao.equals("ˆ")) {
        System.out.print("Operação inserida é potenciação. Por favor, insira a qual potência se deseja elevar: ");
        Integer potencia = scanner.nextInt();
        auxiliarResultado = 1.0;
        for (auxiliarPotencia = 0; auxiliarPotencia < potencia; auxiliarPotencia++) {
            auxiliarResultado *= primeiroNumero;
        }
        resultado = auxiliarResultado;
        System.out.println("Resultado do número "+primeiroNumero+" elevado à "+potencia+" potencia é: "+resultado);
        System.out.println("Auxiliar da potencia está em: "+auxiliarPotencia);
        System.out.println("Potência digitada é: "+potencia);   
    } else {
        System.out.print("Insira o segundo número: ");
        Double segundoNumero = scanner.nextDouble();
        if (operacao.equals("+")) {
        resultado = primeiroNumero + segundoNumero;
        System.out.println("Resultado da adição dos dois números é: "+resultado);
        }
    
        if (operacao.equals("-")) {
        resultado = primeiroNumero - segundoNumero;
        System.out.println("Resultado da subtração dos dois números é: "+resultado);
        }

        if (operacao.equals("*")) {
        resultado = primeiroNumero * segundoNumero;
        System.out.println("Resultado da multiplicação dos dois números é: "+resultado);
        }

        if (operacao.equals("/")) {
        resultado = primeiroNumero / segundoNumero;
        System.out.println("Resultado da divisão dos dois números é: "+resultado);
        }
    }
        
    System.out.println(operacao);
    System.out.println("Obrigado por utilizar a nossa calculadora super mega blaster moderna!");

    Integer centoVinteOito = 127;
    Integer centoVinteOito02 = 127;
    Boolean centoVinteOitoEIgualCentoVinteOito = centoVinteOito.equals(centoVinteOito02);
    System.out.println(centoVinteOitoEIgualCentoVinteOito);
    Boolean centoVinteOitoEIgualCentoVinteOito02 = centoVinteOito == centoVinteOito02;
    System.out.println(centoVinteOitoEIgualCentoVinteOito02);

    // O operador equals() é utilizado para comparar strings também
    // O operador == para números até 127 pode ser utilizado
    // A partir de 128, o operador == não consegue comparar, conforme o exemplo acima. 
    // Ou seja, nos comandos acima o operador == retorna um dado booleano incorreto, quando os valores comparados forem acima de 127
    // Com isso, o operador .equals() não ocorre este erro.


    // Exercício para calcular o valor final de determinado produto, com inclusão ou não de frete, dependendo do valor do produto
    System.out.print("Entre com o valor do produto adquirido: ");
    Double valorDoProduto = scanner.nextDouble();
    Double valorLimiteParaFrete = 200.0;
    final Double valorDeFrete = 15.0;

    if (valorDoProduto >= valorLimiteParaFrete) {
        Double valorFinalDoProduto = valorDoProduto;
        System.out.println("O valor final do produto sem inclusão de frete é: "+valorFinalDoProduto);
    } else {
        Double valorFinalDoProduto = valorDoProduto + valorDeFrete;
        System.out.println("Valor final do produto com inclusão de frete é: "+valorFinalDoProduto);
    }

    scanner.close();
    }
    
    
}
