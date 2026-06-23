package se.lexicon;

import java.util.ArrayList;

/*
 * Shopping List
 * */
public class Exercise01 {
    void main() {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Bread");
        shoppingList.add("Milk");
        shoppingList.add("Egg");
        shoppingList.add("Coffee");
        shoppingList.add("Paprika");

        for (int i = 0; i < shoppingList.size(); i++) {
            IO.println(i + 1 + " " + shoppingList.get(i));
        }

        shoppingList.remove("Bread");

        IO.println("After removing an item:");
        for (int i = 0; i < shoppingList.size(); i++) {
            IO.println(i + 1 + " " + shoppingList.get(i));
        }
    }
}
