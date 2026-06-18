package Main5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main5 {
    public static void main(String[] args) {
        
        List<Integer> number = Arrays.asList(8);

        Function<Integer,Integer> multiplyByTwo = n -> n*2;
        Function<Integer,Integer> subtractFive = n -> n-5;
        Predicate<Integer> isPositive =n -> n > 0;

        List<Integer> result = number.stream()
                                     .map(n ->(int)Math.round(n))
                                     .map(multiplyByTwo)
                                     .map(subtractFive)
                                     .toList();
        
        boolean positive = isPositive.test(result.get(0));

        if (positive == true) {
            System.out.println("正の数です");
        } else if(positive == false){
            System.out.println("負の数またはゼロです");
        }
    }

}
