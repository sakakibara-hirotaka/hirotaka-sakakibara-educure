package Main5;

public class Main5 {
    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount("山田太郎", 10000);

        savingsAccount.deposit(5000);
        savingsAccount.withdraw(3000);
        savingsAccount.displayAccountInfo();
        savingsAccount.getBalance();
    }
}
