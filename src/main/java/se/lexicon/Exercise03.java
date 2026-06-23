package se.lexicon;

import java.util.HashMap;
import java.util.Scanner;

/*
* Phone Book
* */
public class Exercise03 {
    void main() {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Mary", "0731111111");
        phoneBook.put("Katy", "0732222222");
        phoneBook.put("James", "073333333");
        phoneBook.put("Oliver", "0734444444");
        phoneBook.put("Bennett", "0735555555");
        Scanner scanner = new Scanner(System.in);
        IO.print("Enter a name: ");
        String name = scanner.nextLine();
        IO.println(phoneBook.getOrDefault(name, "Contact not found."));
    }
}
