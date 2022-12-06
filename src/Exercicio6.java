import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        // Operadores de atribuição, os quais são: = += -= *= /= %=
        Double numero = 3.0;
        Double numeroMais = 3.0;
        Double numeroMenos = 3.0;
        Double numeroMultiplica = 3.0;
        Double numeroDivide = 3.0;
        Double numeroModulo = 3.0;
        
        numero = numero + 2.0;
        numeroMais += 2.0;          // nessa linha de código armazena-se em numeroMais a soma de 2.0 ao valor já armazenado na variável
        numeroMenos -= 2.0;         // nessa linha de código armazena-se em numeroMenos a subtração de 2.0 do valor já armazenado na variável
        numeroMultiplica *= 2.0;    // nessa linha de código armazena-se em numeroMultiplica a multiplicação de 2.0 ao valor já armazenado na variável
        numeroDivide /= 2.0;        // nessa linha de código armazena-se em numeroDivide a divisão do valor já armazenado na variável por 2.0
        numeroModulo %= 2.0;        // nessa linha de código armazena-se em numeroModulo o resto da divisão do valor já armazenado na variável por 2.0

        System.out.println("Número utilizando operador de atribuição (=): "+numero);
        System.out.println("Número utilizando operador de atribuição (+=): "+numeroMais);
        System.out.println("Número utilizando operador de atribuição (-=): "+numeroMenos);
        System.out.println("Número utilizando operador de atribuição (*=): "+numeroMultiplica);
        System.out.println("Número utilizando operador de atribuição (/=): "+numeroDivide);
        System.out.println("Número utilizando operador de atribuição (%=): "+numeroModulo);

        Scanner scanner = new Scanner(System.in);
        Double contaLuz;
        Double contaAgua;
        Double contaTelefone;
        Double escolaFilho;
        Double escolaFilha;
        Double faturaCartao;
        Double contaSupermercado;
        Double gastoCombustivel;

        System.out.print("Digite o valor da fatura de energia elétrica: ");
        contaLuz = scanner.nextDouble();
        System.out.print("Digite o valor da fatura de água: ");
        contaAgua = scanner.nextDouble();
        System.out.print("Digite o valor da fatura de telefone: ");
        contaTelefone = scanner.nextDouble();
        System.out.print("Digite o valor da fatura da escola do filho: ");
        escolaFilho = scanner.nextDouble();
        System.out.print("Digite o valor da fatura da escola da filha: ");
        escolaFilha = scanner.nextDouble();
        System.out.print("Digite o valor da fatura do cartão de crédito: ");
        faturaCartao = scanner.nextDouble();
        System.out.print("Digite o valor da conta do supermercado: ");
        contaSupermercado = scanner.nextDouble();
        System.out.print("Digite o valor gasto com combustível: ");
        gastoCombustivel = scanner.nextDouble();

        Double gastoTotalMensal = 0.0;
        gastoTotalMensal += contaLuz;
        gastoTotalMensal += contaAgua;
        gastoTotalMensal += contaTelefone;  
        gastoTotalMensal += escolaFilho;  
        gastoTotalMensal += escolaFilha;  
        gastoTotalMensal += faturaCartao;
        gastoTotalMensal += contaSupermercado; 
        gastoTotalMensal += gastoCombustivel;  
        System.out.println("Despesa total mensal da família é de: R$ "+gastoTotalMensal);    
        scanner.close();

    }
}
