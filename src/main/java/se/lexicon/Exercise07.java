package se.lexicon;

import java.util.LinkedHashSet;

/*
* Remove Duplicates, Keep Order
 */
public class Exercise07 {
    void main() {
        int[] numbers = {4, 7, 2, 7, 9, 4, 1, 9, 3};
        LinkedHashSet<Integer> withoutDuplicates = new LinkedHashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            withoutDuplicates.add(numbers[i]);
        }
        IO.print(withoutDuplicates);
    }
}
