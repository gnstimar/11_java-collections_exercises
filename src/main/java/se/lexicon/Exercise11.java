package se.lexicon;

import java.util.TreeMap;

public class Exercise11 {
    void main() {
        /*
         * For this exercise i think the best fit is TreeMap
         * Reason:
         * - it keeps key-value pairs
         * - sorting is solved by design */
        TreeMap<Integer, String> grades = new TreeMap<>();

        grades.put(30, "Adam");
        grades.put(45, "Caty");
        grades.put(51, "Dilan");
        grades.put(70, "Morgen");
        grades.put(80, "Francesca");
        grades.put(68, "Kenneth");

        for (Integer grade : grades.keySet()) {
            IO.println((grade));
            //IO.println(grades.get(grade));
        }
    }
}
