package Main4;

public class Main4 {
    public static void main(String[] args) {
        
        int amountUsd = 100;
        int amountEur = 80;
    
    System.out.println(amountUsd +"ドル = " +  ExchangeRate.toJPY("USD" , amountUsd) + "円");
    ExchangeRate.updateRates(150.0,160.0) ;
    System.out.println(amountUsd +"ドル = " +  ExchangeRate.toJPY("USD" , amountUsd) + "円");
    System.out.println(amountEur +"ユーロ = " +  ExchangeRate.toJPY("EUR" , amountEur) + "円");
    }
}
