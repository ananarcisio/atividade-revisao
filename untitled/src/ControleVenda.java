import java.util.Scanner;

public class ControleVenda {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int qtd_vendas;
        double valorVenda;
        double totalVenda = 0;
        double maiorVenda = 0.00, menorVenda = 0.00;
        double mediaVenda = 0;
        int contador100 = 0, contador13 = 0, contador300 = 0;

        System.out.println("Quantas vendas foram realizadas hoje?");
        qtd_vendas = ler.nextInt();

        int contador = 1;

        while (contador <= qtd_vendas) {
            System.out.print("Venda " + contador + ": R$ ");
            valorVenda = ler.nextDouble();

            totalVenda = totalVenda + valorVenda;


            if (contador == 1) {
                maiorVenda = valorVenda;
                menorVenda = valorVenda;
            } else {

                if (valorVenda > maiorVenda) {
                    maiorVenda = valorVenda;
                }
                if (valorVenda < menorVenda) {
                    menorVenda = valorVenda;
                }
            }


            if (valorVenda < 100) {
                contador100++;
            } else if (valorVenda >= 100 && valorVenda <= 300) {
                contador13++;
            } else if (valorVenda > 300) {
                contador300++;
            }

            contador++;
        }


        if (qtd_vendas > 0) {
            mediaVenda = totalVenda / qtd_vendas;
        }

        System.out.println("\n=== RESUMO DO ABASTECIMENTO ===");
        System.out.println("Quantidade de vendas: " + qtd_vendas);
        System.out.printf("Total vendido: R$ %.2f\n", totalVenda);
        System.out.printf("Média por venda: R$ %.2f\n", mediaVenda);
        System.out.printf("Maior venda: R$ %.2f\n", maiorVenda);
        System.out.printf("Menor venda: R$ %.2f\n", menorVenda);
        System.out.println("Vendas abaixo de R$ 100: " + contador100);
        System.out.println("Vendas entre R$ 100 e R$ 300: " + contador13);
        System.out.println("Vendas acima de R$ 300: " + contador300);

        ler.close();
    }
}
