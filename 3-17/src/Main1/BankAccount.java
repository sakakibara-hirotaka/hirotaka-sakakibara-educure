package Main1;

public class BankAccount {
    
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount <=0){
            System.out.println("正しい数を入力してください");
            }else {
                balance += amount;
                System.out.println(amount +"円入金しました" +"\n残高: " +balance + "円"); 
           }
           
    }

    public void withdraw(int amount) {
        if (amount <=0){
            System.out.println("正しい数を入力してください");
        } else if (balance < amount ) {
            System.out.println("引き出しに失敗しました。残高が不足しています。");
        } else{
            balance -= amount;
            System.out.println(amount +"円引き出しました"+ "\n残高: " +balance + "円");
        }     
    }

    public int getBalance() {
        return balance;
    }
}
