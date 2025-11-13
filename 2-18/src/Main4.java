import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] prices = {100, 200, 300};  // 商品価格
        int[] quantities = {1, 2, 3};    // 数量
        // ここにコードを書いてください
        System.out.println("商品価格: " +  Arrays.toString(prices) + ", " + "数量: "+ Arrays.toString(quantities) );
        
        int[] total = getPrice(prices,quantities);
        System.out.println("合計金額: " + Arrays.toString(total));
    }

    public static int[] getPrice(int[] prices,int[] quantinty) {
        int[] total = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            total[i] = (int)(prices[i]*quantinty[i]*1.1);
        }
        return total;
    } 

}