import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bank = new BankAccount();

        bank.setBalance(0);
        System.out.println("残高: " + bank.getBalance() + "円");

        int depositAmount = scanner.nextInt();
        bank.deposit(depositAmount);
        
        int withdrawAmount = scanner.nextInt();
        bank.withdraw(withdrawAmount);

        withdrawAmount = scanner.nextInt();
        bank.withdraw(withdrawAmount);

        scanner.close();
    }
}
