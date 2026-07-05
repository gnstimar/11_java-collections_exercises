package se.lexicon;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise17 {
    void main() {
        List<String> words = Arrays.asList("java", "python", "java", "c++", "python", "java", "ruby", "c++", "python", "ruby", "java");

        Map<String, Long> wordCounter = words.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        IO.println("The 3 most frequent words: ");
        wordCounter.entrySet()
                .stream().
                sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())).
                limit(3).
                forEach(entry -> IO.println("- " + entry.getKey() + " (" + entry.getValue() + ")"));
    }
}
