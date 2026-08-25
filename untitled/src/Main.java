import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Questão 1 - Sistema de Abastecimento

        Scanner ler = new Scanner(System.in);

        String nome;
        String nome_combustivel = "" ;
        double valor_combustivel;
        double s_desconto;
        double valor_original = 0;
        double preco_litro = 0;
        double desconto_percentual;
        double valor_economizado = 0;
        double valor_final;

        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();

        System.out.println("Combustível:  ");
        System.out.println("1 - Gasolina:  ");
        System.out.println("2 - Etanol:  ");
        System.out.print("Opção: ");
        int combustivel = ler.nextInt();

        System.out.print("Litros:  ");
        int litros = ler.nextInt();

        switch (combustivel) {
            case 1:
                s_desconto = 6.19;
                nome_combustivel = "Gasolina";
                valor_combustivel = s_desconto * litros;
                System.out.println("Combustível escolhido: "+ nome_combustivel);
                System.out.println("Quantidade: " + litros + " litros");
                System.out.printf("Valor sem desconto: R$ %.2f\n", valor_combustivel);
                break;
            case 2:
                s_desconto = 4.29;
                nome_combustivel = "Etanol";
                valor_combustivel = s_desconto * litros;
                System.out.println("Combustível escolhido: "+ nome_combustivel);
                System.out.println("Quantidade: " + litros + " litros");
                System.out.println("Valor sem desconto: " + valor_combustivel);
                break;
            default:
                System.out.println("Tipo de combustível inválido.");
                ler.close();
                return;
        }

        if (combustivel == 1){
            preco_litro = 6.19;
            valor_original = preco_litro * litros;
        } else if(combustivel == 2){
            preco_litro = 4.29;
            valor_original = preco_litro * litros;
        }



        if (valor_original <= 100.00) {
            desconto_percentual = 0;
        } else if (valor_original > 100.00 && valor_original <= 200.00) {
            desconto_percentual = 3; // 3% de desconto
        } else {
            desconto_percentual = 5; // 5% de desconto
        }

        valor_economizado = valor_original * (desconto_percentual / 100);
        valor_final = valor_original - valor_economizado;

        System.out.println("\n=== RESUMO DO ABASTECIMENTO ===");
        System.out.println("Cliente: " + nome);
        System.out.println("Combustível escolhido: " + nome_combustivel);
        System.out.println("Quantidade: " + litros + " litros");
        System.out.printf("Valor original: R$ %.2f\n", valor_original);
        System.out.printf("Percentual de desconto: %.0f%%\n", desconto_percentual);
        System.out.printf("Valor economizado: R$ %.2f\n", valor_economizado);
        System.out.printf("Valor Final a pagar: R$ %.2f\n", valor_final);

        ler.close();
    }
}