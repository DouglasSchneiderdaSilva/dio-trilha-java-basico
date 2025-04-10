import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int num;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta: ");
       num = scn.nextInt();
        scn.nextLine(); // Limpa o buffer do scanner

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scn.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scn.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        saldo = scn.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + num + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        scn.close();



    }
}
