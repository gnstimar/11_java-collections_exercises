package se.lexicon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
* Merge Without Duplicates
* */
public class Exercise08 {
    void main() {
        List<Integer> listA = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> listB = Arrays.asList(3, 4, 5, 6, 7);
        HashSet<Integer> set = new HashSet<>(listA);
        set.addAll(listB);
        IO.println("Merged numbers: " + set);
        IO.println("Total count: " + set.size());
    }
}
