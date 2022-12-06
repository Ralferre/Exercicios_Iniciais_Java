import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        // Exercício para avaliar se uma pessoa preenche os requisitos para se aposentar

        Scanner scanner = new Scanner(System.in);

        System.out.println("CÓDIGO DE VALIDAÇAO DE REQUISITOS PARA APOSENTADORIA");
        System.out.print("Insira sua idade: ");
        Integer idade = scanner.nextInt();

        System.out.print("Informe seu tempo de contribuição com a Previdência Social: ");
        Integer tempoContribuicao = scanner.nextInt();

        System.out.print("Por favor, informe seu gênero (M) - Masculino ou (F) - Feminino: ");
        String genero = scanner.next();
        Boolean idadeAposenta = false;
        Boolean tempoContribuicaoAposenta = false;
        Boolean generoMasculino = false;;
        Boolean generoFeminino = false;

        if (genero.equals("M")) {
            generoMasculino = true;
        } else {
            generoFeminino = true;
        }
        
        // Tratando usuário que inseriu gênero masculino (M)
        if (generoMasculino) {
            if (idade >= 65) {
                idadeAposenta = true;
            } else {
                idadeAposenta = false;
                }
            if (tempoContribuicao >= 35) {
                tempoContribuicaoAposenta = true;
                } else {
                    tempoContribuicaoAposenta = false;
                }
            }

        // Tratando usuário que inseriu gênero feminino (F)
        if (generoFeminino) {
            if (idade >= 61) {
                idadeAposenta = true;
            } else {
                idadeAposenta = false;
                }
            if (tempoContribuicao >= 35) {
                tempoContribuicaoAposenta = true;
                } else {
                    tempoContribuicaoAposenta = false;
                }
            }
        
        // Tratando idade e tempo de contribuição para validar aposentadoria gênero masculino
        if (generoMasculino) {
            if (idadeAposenta && tempoContribuicaoAposenta) {
                System.out.println("Muito bom, você preenche os requisitos para se aposentar, idade de "+idade+" e "+tempoContribuicao+" anos de contribuição.");
            } else {
                if (!idadeAposenta) {
                    System.out.println("Infelizmente você não preenche os requisitos para se aposentar por idade.");
                    System.out.println("Sua idade é "+idade+" anos. Conforme a nova regra, idade mínima para homens é de 65 anos.");
                    idade = 65 - idade;
                    System.out.println("Portanto, falta(m) "+idade+" ano(s) para você se aposentar por idade.");
                }
                if (!tempoContribuicaoAposenta) {
                    System.out.println("Infelizmente você não preenche os requisitos para se aposentar por tempo de contribuição.");
                    System.out.println("Seu tempo de contribuição é "+tempoContribuicao+" anos. Conforme a nova regra, tempo mínimo deve ser de 35 anos.");
                    tempoContribuicao = 35 - tempoContribuicao;
                    System.out.println("Portanto, falta(m) "+tempoContribuicao+" ano(s) para você se aposentar por tempo de contribuição.");
                    }             
                }
        } 
        // Tratando idade e tempo de contribuição para validar aposentadoria gênero feminino
        if (generoFeminino) {
            if (idadeAposenta && tempoContribuicaoAposenta) {
                System.out.println("Muito bom, você preenche os requisitos para se aposentar, idade de "+idade+" e "+tempoContribuicao+" anos de contribuição.");
            } else {
                if (!idadeAposenta) {
                    System.out.println("Infelizmente você não preenche os requisitos para se aposentar por idade.");
                    System.out.println("Sua idade é "+idade+" anos. Conforme a nova regra, idade mínima para mulheres é de 61 anos.");
                    idade = 61 - idade;
                    System.out.println("Portanto, falta(m) "+idade+" ano(s) para você se aposentar por idade.");
                }
                if (!tempoContribuicaoAposenta) {
                    System.out.println("Infelizmente você não preenche os requisitos para se aposentar por tempo de contribuição.");
                    System.out.println("Seu tempo de contribuição é "+tempoContribuicao+" anos. Conforme a nova regra, tempo mínimo deve ser de 35 anos.");
                    tempoContribuicao = 35 - tempoContribuicao;
                    System.out.println("Portanto, falta(m) "+tempoContribuicao+" ano(s) para você se aposentar por tempo de contribuição.");
                    }              
                }
        }       
        scanner.close();    
    }
}
