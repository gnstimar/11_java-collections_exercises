package se.lexicon;

/*
 * Find the Largest
 * */
public class Exercise04 {
    void main() {
        int[] numbers = {14, 3, 78, 45, 22, 91, 7, 56};

        IO.println(findMax(numbers));
    }

    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Numbers don't have max value (it is empty or null)!");
        }

        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
