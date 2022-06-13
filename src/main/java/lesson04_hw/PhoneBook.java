package lesson04_hw;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook(int size) {
        phoneBook = new HashMap<>(size);
    }

    public void add(String name, String phoneNumber) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }

        phoneBook.get(name).add(phoneNumber);
    }

    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }

    public void printPhoneBook() {
        phoneBook.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}
