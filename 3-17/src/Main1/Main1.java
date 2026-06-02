package Main1;

public class Main1 {
    public static void main(String[] args) {
        
        BankAccount bank = new BankAccount(1000);

        System.out.println("残高: " + bank.getBalance() + "円");
        bank.deposit(2000);
        bank.withdraw(1500);
        bank.withdraw(15000);
    }
}

