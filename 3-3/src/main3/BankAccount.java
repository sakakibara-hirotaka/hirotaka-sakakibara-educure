public class BankAccount {

    int balance; //残高
    
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //預金
    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "円預けました");
        System.out.println("残高: " + balance + "円");
    }
    
    //引き出し
    public void withdraw(int amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println(amount + "円引き出しました");
            System.out.println("残高: " + balance + "円");
        } else {
            System.out.println("残高が不足しています");
        }    

    }
    
}
