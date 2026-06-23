package se.lexicon;

import java.util.TreeMap;

/*
* Word Frequency
* */
public class Exercise06 {
    void main() {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple", "grape", "orange"};
        TreeMap<String, Integer> frequency = new TreeMap<>();
        for (String word: words) {
            if (frequency.containsKey(word)) {
                frequency.put(word, (frequency.get(word) + 1));
            } else {
                frequency.put(word, 1);
            }
        }
        IO.println(frequency);
    }
}
