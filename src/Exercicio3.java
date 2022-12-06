import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Exercício para avaliar se alunos são aprovados
        
        Scanner nome1 = new Scanner(System.in);
        System.out.print("Insira o nome do aluno 1: ");
        String nome11 = nome1.nextLine();

        Scanner notaAluno1 = new Scanner(System.in);
        System.out.print("Insira a nota do aluno 1: ");
        Double notaAluno11 = notaAluno1.nextDouble();

        Scanner nome2 = new Scanner(System.in);
        System.out.print("Insira o nome do aluno 2: ");
        String nome22 = nome2.nextLine();

        Scanner notaAluno2 = new Scanner(System.in);
        System.out.print("Insira a nota do aluno 2: ");
        Double notaAluno22 = notaAluno2.nextDouble();

        Scanner nome3 = new Scanner(System.in);
        System.out.print("Insira o nome do aluno 3: ");
        String nome33 = nome3.nextLine();

        Scanner notaAluno3 = new Scanner(System.in);
        System.out.print("Insira a nota do aluno 3: ");
        Double notaAluno33 = notaAluno3.nextDouble();

        if (notaAluno11 >= 7) {
            Boolean aluno1Aprovado = true;
            System.out.println("Aluno 1 é: "+nome11+" e sua nota foi: "+notaAluno11+", condição de aprovado! Status teste: "+aluno1Aprovado);
        } else {
            Boolean aluno1Aprovado = false;
            System.out.println("Aluno 1 é: "+nome11+" e sua nota foi: "+notaAluno11+", condição de reprovado! Status teste: "+aluno1Aprovado);
        }

        if (notaAluno22 >= 7) {
            Boolean aluno2Aprovado = true;
            System.out.println("Aluno 2 é: "+nome22+" e sua nota foi: "+notaAluno22+", condição de aprovado! Status teste: "+aluno2Aprovado);
        } else {
            Boolean aluno2Aprovado = false;
            System.out.println("Aluno 2 é: "+nome22+" e sua nota foi: "+notaAluno22+", condição de reprovado! Status teste: "+aluno2Aprovado);
        }

        if (notaAluno33 >= 7) {
            Boolean aluno3Aprovado = true;
            System.out.println("Aluno 3 é: "+nome33+" e sua nota foi: "+notaAluno33+", condição de aprovado! Status teste: "+aluno3Aprovado);
        } else {
            Boolean aluno3Aprovado = false;
            System.out.println("Aluno 3 é: "+nome33+" e sua nota foi: "+notaAluno33+", condição de reprovado! Status teste: "+aluno3Aprovado);
        }

        nome1.close();
        nome2.close();
        nome3.close();
        notaAluno1.close();
        notaAluno2.close();
        notaAluno3.close();
    }
}

// Além do teste de estruturas condicionais, podemos avaliar os tipos de declaração de variáveis
// Variáveis do tipo primitovo utilizam a seguinte notação: byte, short, int, long, float, double, char e boolean
// A principal diferença entre o tipo primitivo (int) e o normal (Integer), é que a primitiva não aceita valor nulo (null)
// Ater para trechos de código que possam gerar algum dado null, e com isso não cabe utilizar variável de tipo primitivo
