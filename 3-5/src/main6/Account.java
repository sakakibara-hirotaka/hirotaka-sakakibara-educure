package main6;

public class Account {
    int accountNunber;
    int balance;

    public Account(int accountNunber , int balance){
        this.accountNunber = accountNunber;
        this.balance = balance;

        System.out.println("口座番号:" + this.accountNunber);
    }

    public void deposit(int payment) {
        this.balance = this.balance + payment;
        System.out.println("残高:" + this.balance + "円");
    }

    public void withdraw(int Withdrawal) {
        this.balance = this.balance - Withdrawal;
        System.out.println("出金後残高:" +this.balance + "円");
    }
}
