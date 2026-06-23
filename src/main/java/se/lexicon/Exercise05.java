package se.lexicon;

import java.util.Scanner;

/*
 * Count by Letter
 * */
public class Exercise05 {
    void main() {
        String[] names = {"Anna", "Bob", "Alice", "Charlie", "Amanda", "David", "Amy", "Brian"};
        Scanner scanner = new Scanner(System.in);
        IO.print("Enter a letter: ");
        String letter = scanner.next();
        int occurrence = 0;
        for (String name : names) {
            if (name.startsWith(String.valueOf((letter.charAt(0))).toUpperCase())) {
                occurrence++;
            }
        }
        IO.println(occurrence);
    }
}
