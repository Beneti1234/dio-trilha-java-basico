
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor, digite a agência: exemplo XXX-X");
        String agencia = scanner.next();

        System.out.println("Digite seu nome e sobrenome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo de sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
