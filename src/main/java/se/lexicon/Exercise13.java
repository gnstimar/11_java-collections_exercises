package se.lexicon;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise13 {
    void main() {
        List<String> words = Arrays.asList("cat", "dog", "cat", "bird", "dog", "cat", "fish", "dog", "dog");

        Map<String, Long> groupedNames = words.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        groupedNames.forEach((word, count) -> {
            IO.println(word + ": " + count);
        });
    }
}
