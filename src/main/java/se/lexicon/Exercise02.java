package se.lexicon;

import java.util.HashSet;
import java.util.Set;

/*
 * Unique Cities
 * */
public class Exercise02 {
    void main() {
        Set<String> set = new HashSet<>();
        set.add("Stockholm");
        set.add("Gothenburg");
        set.add("Malmö");
        set.add("Stockholm");
        set.add("Uppsala");
        set.add("Gothenburg");
        set.add("Lund");

        IO.println(set);
        IO.println("Length of the set is: " + set.size());
    }
}
