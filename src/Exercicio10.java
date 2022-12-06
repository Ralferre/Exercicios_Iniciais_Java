import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Exercício para aplicação dos conceitos de esturura de decisão SWITCH
        // Exercício para avaliar dependendo do dígito inserido, informar a qual dia da semana o mesmo se refere
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número de 1 a 7 que indique um dia da semana: ");
        Integer numero = scanner.nextInt();
        String diaDaSemana = "";

        switch (numero) {
            case 1: diaDaSemana = "Domingo";
                break;
            case 2: diaDaSemana = "Segunda-feira";
                break;
            case 3: diaDaSemana = "Terça-feira";
                break;
            case 4: diaDaSemana = "Quarta-feira";
                break;
            case 5: diaDaSemana = "Quinta-feira";
                break;
            case 6: diaDaSemana = "Sexta-feira";
                break;
            case 7: diaDaSemana = "Sábado";
                break;
            default:
                System.err.println("Digite um número válido que indique um dia da semana (1 a 7).");
                System.exit(1);
        }
        System.out.println("Dia da semana é: "+diaDaSemana);


        scanner.close();
    }
}
