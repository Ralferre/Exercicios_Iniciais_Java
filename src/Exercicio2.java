import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nomeDigitado = nome.nextLine();
        
        Scanner sobrenome = new Scanner(System.in);
        System.out.print("Digite seu sobrenome: ");
        String sobrenomeDigitado = sobrenome.nextLine();
        
        System.out.println("Seu nome digitado foi: "+nomeDigitado);
        System.out.println("Seu sobremone digitado foi: "+sobrenomeDigitado);
        System.out.println("Seu nome completo é: "+nomeDigitado+" "+sobrenomeDigitado);
        nome.close();
        sobrenome.close();

        // Alguns dos conceitos trabalhados
        // Definição de class para trabalhar/manipular strings (public static void main(String[] args))
        // Leitura de dados inseridos pelo usuário e armazenado em variáveis do tipo string
        // Apresentação dos dados inseridos pelo usuário com concatenação dessas variáveis inseridas
    }
}