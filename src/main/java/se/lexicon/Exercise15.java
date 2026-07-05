package se.lexicon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise15 {
    void main() {
        List<Integer> numbers = Arrays.asList(2, 7, 11, 15, 4, 6);
        int target = 13;

        Set<Integer> checkedNumbers = new HashSet<>();

        for (int number : numbers) {
            int complement = target - number;
            if (checkedNumbers.contains(complement)) {
                IO.println("Found a pair: " + number + " + " + complement + " = " + target);
            }
            checkedNumbers.add(number);
        }
    }
}
