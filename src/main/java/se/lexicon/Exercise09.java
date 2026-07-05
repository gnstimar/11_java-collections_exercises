package se.lexicon;

import java.util.HashSet;

public class Exercise09 {
    void main() {
        /*
        * For this exercise i think the best fit is HASHSET
        * Reason:
        * - it handles by default the duplicates (it gives back false if we try to add an element that is already in it)
        * - the order doesn't matter
        * - in this simplified example it is enought to store the name of a student
        * */
        HashSet<String> submissions = new HashSet<>();

        String[] students = {
                "Adam",
                "Betty",
                "Kenny",
                "Adam",
                "Ken",
                "Kenny",
                "Julia",
                "Adam"
        };

        for (String student : students) {
            if (!submissions.add(student)) {
                IO.println("ERROR: " + student + " has already submitted the homework.");
            } else {
                IO.println("SUCCESS: Submission is received from " + student);
            }
        }
IO.println(submissions);
    }
}
