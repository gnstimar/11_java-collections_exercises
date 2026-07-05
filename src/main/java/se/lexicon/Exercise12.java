package se.lexicon;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise12 {
    void main() {
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Brian", "Amanda", "Carl");

        Map<Character, List<String>> groupedNames = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));

        groupedNames.forEach((firstLetter, nameList) -> {
            IO.println(firstLetter + ": " + nameList);
        });
    }
}
