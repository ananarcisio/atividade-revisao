import java.util.Scanner;

public class AvaliacaoAluno {
    //psvm
    public static void main(String[] args) {
        //Questão 2 - Sistema de Avaliação Acadêmica
        Scanner ler = new Scanner(System.in);

        String nome;
        String situacao = "";
        int trabalho;
        int prova;
        int projeto;
        int media = 0;

        System.out.print("Digite o nome do aluno: ");
        nome = ler.nextLine();

        System.out.print("Digite a nota do trabalho: ");
        trabalho = ler.nextInt();

        System.out.print("Digite a nota da prova: ");
        prova = ler.nextInt();

        System.out.print("Digite a nota da projeto: ");
        projeto = ler.nextInt();

        media = (trabalho * 2 + prova * 5 + projeto * 3) / 10;

        if (media >= 70){
            situacao = "APROVADO";
        } else if (media >= 50 && media < 70){
            situacao = "RECUPERAÇÃO";
        } else if (media < 50){
            situacao = "REPROVADO";
        } else {
            situacao = "REPROVADO POR DESEMPENHO INSUFICIENTE";
        }

        System.out.println("\n=== RESUMO DO ALUNO ===");
        System.out.println("Aluno: " + nome);
        System.out.println("Trabalho: " + trabalho);
        System.out.println("Prova: " + prova);
        System.out.println("Projeto: " + projeto);
        System.out.println("Média: "+ media);
        System.out.println("Situação: "+ situacao);

        ler.close();
    }
}
