package Main5;

public class SavingsAccount implements BankAccount {

    String nameHolder; //口座名義人
    int balance; //残高

     public SavingsAccount(String nameHolder , int balance){
        this.nameHolder = nameHolder;
        this.balance = balance;
    }

    @Override
    public void deposit(int inMoney){
        if (inMoney <= 0) {
            System.out.println("エラー:1円以上の入金金額を入力してください");
        }else {
        System.out.println(inMoney +"円入金しました");
        balance += inMoney;
        }
    }

    @Override
    public void withdraw(int outMoney){
        if (outMoney >balance) {
            System.out.println("引き出し可能な残高がありません");
        }else if (outMoney > 0 ){
        System.out.println(outMoney +"円出金しました");
        balance -= outMoney;
        } else {
            System.out.println("エラー:1円以上の出金金額を入力してください");
        }
        
    }

    @Override
    public int getBalance() {
        System.out.println("残高: " + balance);
        return balance;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("口座名義人: " + this.nameHolder);
    }

}
