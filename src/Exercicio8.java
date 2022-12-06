import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // Código para avaliar aprovação do candidato ao concurso público
        // Aplicando conceitos de estruturas de decisão

        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        Double notaProvaPortugues;
        Double notaProvaMatematica;
        final Double minimoAprovacaoConcurso = 150.0;
        final Double minimoHabilitaAprovacaoMaterias = 60.0;
        Double notaTotalCandidato;

        // Lendo dados de entrada do usuário
        System.out.print("Insira nota da avalição de português: ");
        notaProvaPortugues = scanner.nextDouble();
        System.out.print("Insira nota da avaliação de matemática: ");
        notaProvaMatematica = scanner.nextDouble();

        // Analisando requisitos de aprovação do candidato no concurso
        if (notaProvaPortugues >= minimoHabilitaAprovacaoMaterias) {
            if (notaProvaMatematica >= minimoHabilitaAprovacaoMaterias) {
                notaTotalCandidato = notaProvaPortugues + notaProvaMatematica;
                if (notaTotalCandidato >= minimoAprovacaoConcurso) {
                    System.out.println("Parabéns! Você foi aprovado no concurso. Sua nota total foi: "+notaTotalCandidato);
                } else {
                    System.out.println("Infelizmente você não foi aprovado no concurso.");
                    System.out.println("Sua nota total foi: "+notaTotalCandidato+", porém nota mínima de aprovação no concurso é: "+minimoAprovacaoConcurso);
                }  
            } else {
                notaTotalCandidato = notaProvaPortugues + notaProvaMatematica;
                System.out.println("Infelizmente você não foi aprovado no concurso.");
                System.out.println("Conforme edital, necessário atingir mínimo de 60 pontos em cada disciplina.");
                System.out.println("Também conforme o edital, pontuação mínima de "+minimoAprovacaoConcurso+" para aprovação.");
                System.out.println("Atingindo mínimo em cada disciplina, habilita candidato para cálculo da nota final.");
                System.out.println("Sua nota total foi: "+notaTotalCandidato+", e sua nota de matemática ficou abaixo do mínimo de 60,0.");
            }
        } else {
            if (!(notaProvaMatematica >= minimoHabilitaAprovacaoMaterias)) {
                System.out.println("Infelizmente você não foi aprovado no concurso");
                System.out.println("Sua nota em cada disciplina ficou abaixo do mínimo para habilitaçao de candidato.");
            } else {
                notaTotalCandidato = notaProvaPortugues + notaProvaMatematica;
                System.out.println("Infelizmente você não foi aprovado no concurso.");
                System.out.println("Conforme o edital, necessário atingir mínimo de 60 pontos em cada disciplina.");
                System.out.println("Também conforme o edital, pontuação mínima de "+minimoAprovacaoConcurso+" para aprovação.");
                System.out.println("Atingindo mínimo em cada disciplina, habilita candidato para cálculo da nota final.");
                System.out.println("Sua nota total foi: "+notaTotalCandidato+", e sua nota de português ficou abaixo do mínimo de 60,0.");
            }    
        }
        scanner.close();
    }
}
