import java.util.Scanner;

public class AccountTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agência: ");
        String agencyNumber = scanner.nextLine();

        System.out.println("Por favor, digite o numero da Conta: ");
        String accountNumber = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String accountHolder = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta: ");
        double balance = scanner.nextDouble();

        scanner.close();

        System.out.println(
                " Olá " + accountHolder + " , sua conta foi criada com sucesso, e sua agência é " + agencyNumber
                        + " , conta " + accountNumber + " e seu saldo " + balance + " já está disponivel para saque");
    }
}
