package Main2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        List<String> upperwords = words.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());

        System.out.println(upperwords);
    }
}
