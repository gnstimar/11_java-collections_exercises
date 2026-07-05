package se.lexicon;

import java.util.Arrays;
import java.util.List;

public class Exercise16 {
    void main() {
        List<Integer> numbers = Arrays.asList(34, 78, 23, 78, 91, 56, 91, 12);

        int largest = 0;
        int secondLargest = 0;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        IO.println("Second largest number is " + secondLargest);
    }
}
