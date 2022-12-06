import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        // Pequeno algoritmo para calcular valor de um número quando elevado ao quadrado
        // Pequeno algoritmo para calcular valor da raiz quadrada de um dado número digitado
        // Testando os primeiros comandos de atribuição de valor a variáveis
        // Comandos para capturar valores/dados inseridos pelo usuário
        // Comandos para report ao usuário

        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o número para conhecê-lo elevado ao quadrado: ");
        Double numeroDigitado = numero.nextDouble();
        System.out.println("Número digitado: "+numeroDigitado);  // mostra o valor contido na variável no padrão americano, separação por ponto(.)
        Double valorQuadrado = numeroDigitado * numeroDigitado;
        System.out.println("O valor elevado ao quadrado desse número é: "+valorQuadrado);

        Scanner numero1 = new Scanner(System.in);
        System.out.print("Digite o número para extrair sua raiz quadrada: ");
        Double numero1Digitado = numero1.nextDouble();
        Double valorRaiz = Math.sqrt(numero1Digitado);
        System.out.println("Valor da raiz quadrada do número é: "+valorRaiz);
        numero.close();
        numero1.close();

        // Relembrando alguns detalhes de variáveis:
        // Byte numeroByte = 1;         conseguimos armazenar números de -128 até 127
        // Short numeroShort = 1;       conseguimos armazenar números de -32768 até 32767
        // Integer numeroInteger = 1;   conseguimos armazenar números de -(2ˆ31) até (2ˆ31) - 1
        // Long numeroLong = 1L;        conseguimos armazenar números de -(2ˆ63) até (2ˆ63) - 1. Usa-se "L" para diferenciar do tipo Integer
        // Double numeroDouble = 1.1;   conseguimos armazenar números com casas decimais
        // Float numeroFloat = 1.1f;    conseguimos armazenar números com casas decimais. Usa-se "f" para diferenciar do tipo Double
        // Uso da função Math.sqrt() para extrair a raiz quadrada de um número
    }
    
}
