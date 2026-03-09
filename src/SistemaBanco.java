import java.util.Scanner;

public class SistemaBanco {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 2500.00;
        String nome = "Jonathan Leandro";
        String tipoConta = "Corrente";
        int opcao = 0;

        System.out.println("************************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo disponível: " + saldo);
        System.out.println("\n************************");

        while (opcao != 4) {
            System.out.println("\nOperações: ");
            System.out.println("1- Consultar saldos.");
            System.out.println("2- Receber valor.");
            System.out.println("3- Transferir valor.");
            System.out.println("4- Sair.");

            System.out.println("\nInforme a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.print("Informe o valor que deseja receber: ");
                    double valorRecebido = sc.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("Novo saldo: " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    double valorEnviado = sc.nextDouble();

                    if (valorEnviado > saldo) {
                        System.out.println("Não há saldo suficiente.");
                    } else {
                        saldo -= valorEnviado;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção Inválida!!!");

            }
        }
        sc.close();
    }

}