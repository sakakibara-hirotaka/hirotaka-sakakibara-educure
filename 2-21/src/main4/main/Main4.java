package main;

import java.util.ArrayList;
import numbers.ProcessNumbers;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        ProcessNumbers.processNumbers(numbers);
    }
}
