package Main4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        int result = 0;
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        List<Integer> doublenumbers = numbers.stream()
                                             .filter(n -> n%2 ==0)
                                             .map(n -> n*2)
                                             .collect(Collectors.toList());
        for (int number : doublenumbers) {
            result =result+number;
        }
        System.out.println("結果: " + result);
    }
}
