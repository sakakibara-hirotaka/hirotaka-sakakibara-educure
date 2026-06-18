package Main3;

import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("banana", "apple", "date", "cherry", "elderberry");

        List<String> sortWords = words.stream()
                                      .filter(n -> n.length() >= 5)
                                      .sorted()
                                      .toList();

        System.out.println(sortWords);
                                      
    }
}
