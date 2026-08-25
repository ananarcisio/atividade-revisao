import java.util.Scanner;

public class ControleEstacionamento {
    public static void main(String[] args) {
        //Questão 3 - Controle de Estacionamento
        Scanner ler = new Scanner(System.in);

        int hora_entrada;
        int hora_saida;
        int permanecia;
        double valor_pagar = 0.00;
        int horas_adicionais = 0;
        double valor_adicional = 0;

        System.out.print("Hora de entrada: ");
        hora_entrada = ler.nextInt();

        System.out.print("Hora de saída: ");
        hora_saida = ler.nextInt();

        if(hora_entrada > hora_saida){
            System.out.println("Horário informado é inválido.");
            ler.close();
            return;
        }

        permanecia = hora_saida - hora_entrada;

        if (permanecia <= 1){
            valor_pagar = 8.00;
        } else if (permanecia <= 3 ){
            valor_pagar = 15.00;
        } else if (permanecia <= 5 ){
            valor_pagar = 25.00;
        } else {
            horas_adicionais = permanecia - 5;
            valor_adicional = horas_adicionais * 5.00;
        }

        System.out.printf("Tempo de permanência: %d hora(s)\n", permanecia);
        System.out.printf("Horas adicionais: %d * R$ 5,00 = R$ %.2f\n", horas_adicionais, valor_adicional);
        System.out.printf("Valor total: R$ %.2f\n", valor_pagar);

        ler.close();
    }
}
