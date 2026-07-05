package se.lexicon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise14 {
    void main() {
        List<Integer> listA = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> listB = Arrays.asList(3, 6, 9, 12, 15);

        Set<Integer> commonSet = new HashSet<>(listB);
        commonSet.retainAll(listA);
        IO.println("Common numbers: " + commonSet);
    }
}
