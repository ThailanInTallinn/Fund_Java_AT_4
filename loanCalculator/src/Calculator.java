import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o seu nome: ");
        String userName = sc.nextLine();
        System.out.print("Insira o valor do empréstimo: ");
        double amount = sc.nextDouble();
        int numInstallments;

        do {
            System.out.print("Insira o número de parcelas(6 a 48): ");
            numInstallments = sc.nextInt();
        } while(numInstallments < 6 || numInstallments > 48);

        double totalAmount = amount + (amount * (3.0 / 100));
        double installment = totalAmount / numInstallments;

        System.out.println(String.format("O valor total a ser pago é de R$%.2f", totalAmount));
        System.out.println(String.format("O valor da prestação é de R$%.2f", installment));
    }
}
