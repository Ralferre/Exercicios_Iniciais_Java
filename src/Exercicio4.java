import java.util.Scanner;
        
public class Exercicio4 {
    // static final QUANTIDADE_PRODUTO_DESCONTO         // também podemos declarar constantes assim
    static final Integer QUANTIDADE_PRODUTO_DESCONTO = 10;
    public static void main(String[] args) {
        // Exercício para calcular valor de desconto conforme a quantidade de peças adquiridas pelo usuário
        // Além disso, mostrar o valor total com o % de desconto aplicado conforme a quantidade de peças adquiridas

        Double valorProduto;
        Integer quantidadeProduto;
        // final Integer QUANTIDADE_PRODUTO_DESCONTO = 10;     // podemos declarar constantes assim
        Double subtotal;
        Double desconto;
        Double valorTotal;

        Scanner scanner = new Scanner(System.in);           // captura de valor digitado/inserido pelo usuário e armazena na variável scanner temporariamente
        System.out.print("Digite o valor do produto (R$): ");
        valorProduto = scanner.nextDouble();                // atribui o valor armazenado na variável scanner para a variável valorProduto
        System.out.print("Digite a quantidade de produto a ser adquirida (un) ou (l): ");
        quantidadeProduto = scanner.nextInt();              // atribui o valor armazenado na variável scanner para a variável quantidadeProduto

        subtotal = valorProduto * quantidadeProduto;
        System.out.println("Valor digitado do produto é: R$ "+valorProduto);
        System.out.println("Quantidade de produtos é: "+quantidadeProduto+" (un) ou (l)");
        System.out.println("Subtotal: R$ "+subtotal);

        if (quantidadeProduto >= QUANTIDADE_PRODUTO_DESCONTO) {
            desconto = (subtotal * QUANTIDADE_PRODUTO_DESCONTO) / 100;
            valorTotal = subtotal - desconto;
            System.out.println("Valor total: R$ "+valorTotal);
        } else {
            valorTotal = subtotal;
            System.out.println("Valor total: R$ "+valorTotal);
        }
        scanner.close(); 
        
        // Escolhendo bons nomes de variáveis. Pensar que outras pessoas terão acesso ao código;
        // Outras pessoas necessitam analisar seu código e propor melhorias;
        // Escolher nomes de variáveis;
        // Não pode conter caracteres especiais;
        // Não pode iniciar com números;
        // Não pode conter acentos ^ ';
        // Utilizar nomes de variáveis com a chamada CamelCase, sempre que tiver dois nomes, o primeiro inicia com letra  minúscula e os demais iniciam com letra maiúscula
        // Nomes das constantes utilizar em letras maiúsculas e separadas por _, por exemplo: PRECO_COMBUSTIVEL;
        // Escrever códigos de forma que a linguagem humana entenda o que o çodigo faz e os dados envolvidos

    }    
}
