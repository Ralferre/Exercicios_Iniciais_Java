import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        // Exercício para calcular bônus de funcionário
        // Este código compara o realizado com a meta e dependendo da média salarial do funcionário, dertermina o bônus a ser pago ao funcionário
        // Exercício aplicando conceitos de if encadeado

        Scanner scanner = new Scanner(System.in);
        
        // Declarando variáveis
        final Double metaFaturamentoAnual =100.0;
        Double faturamentoRealAnual;
        Double mediaSalarialFuncionario;
        Double bonusFuncionario;

        // Captura dados inseridos pelo usuário
        System.out.print("Digite o valor de  faturamento anual da empresa (R$): ");
        faturamentoRealAnual = scanner.nextDouble();
        System.out.print("Digite a média salarial anual do funcionário (R$): ");
        mediaSalarialFuncionario = scanner.nextDouble();

        // Avaliando atingimento da meta anual
        if (faturamentoRealAnual >= metaFaturamentoAnual) {
            bonusFuncionario = mediaSalarialFuncionario;
            System.out.println("Parabéns! A meta de faturamento foi atingida e você receberá bônus de "+bonusFuncionario);
        } else {
            if (faturamentoRealAnual >= 80.0) {
                bonusFuncionario = (80 * mediaSalarialFuncionario) / 100;
                System.out.println("Parabéns! Atingimento de 80% da meta anual, portanto você receberá bônus de "+bonusFuncionario);
            } else {
                bonusFuncionario = (30 * mediaSalarialFuncionario) / 100;
                System.out.println("Infelizmente você não atingiu % da meta de faturamento");
                System.out.println("Com isso, bônus de 30% da média salarial do funcionário, o qual resultou em: R$ "+bonusFuncionario);
                System.out.println("Elabore plano estratégico para o próximo ano com foco em ações para atingir meta de faturamento.");
                System.out.println("Esteja sempre disposto a reiniciar de forma que não venha a se arrepender de não ter tentado.");
            }
        }

        scanner.close();
    }
}
