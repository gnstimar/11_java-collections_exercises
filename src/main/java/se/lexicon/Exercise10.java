package se.lexicon;

import java.util.LinkedList;

public class Exercise10 {
    void main() {
        /*
         * For this exercise i think the best fit is LinkedList
         * Reason:
         * - it keeps the order
         * - it is easy to put or remove a new element in the beginning or the end ot the list*/

        LinkedList<String> queue = new LinkedList<>();
        queue.add("John");
        queue.add("Monica");
        queue.add("Hugo");
        queue.add("Tommy");
        queue.add("Guccio");
        queue.add("Francesca");

        queue.remove(queue.getFirst());
        queue.remove(queue.getFirst());

        IO.println(queue);
    }
}
