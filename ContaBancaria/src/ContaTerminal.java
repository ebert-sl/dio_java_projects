import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.print("Digite o número da agência: ");
        agencia = scanner.next();
        System.out.print("Digite o seu nome: ");
        nomeCliente = scanner.next();
        System.out.print("Digite o saldo de sua conta: ");
        saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
