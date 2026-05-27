package main3;

public class Main3 {
    public static void main(String[] args) {

        BankAccount bank1 = new BankAccount(5000);
        BankAccount bank2 = bank1;

        bank1.setBalance(3000);

        System.out.println("口座1の残高: " + bank1.balance);
        System.out.println("口座2の残高: " + bank2.balance);

        
    }
}
