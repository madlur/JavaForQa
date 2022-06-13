package lesson04_hw;

import java.util.HashMap;
import java.util.Map;

public class MainApp {

    public static void main(String[] args) {

//  Задание №1

        String[] words = {
                "Рыба", "Щука", "Акула", "Креветка", "Рыба",
                "Лосось", "Щука", "Окунь", "Рыба", "Карась"
        };

        System.out.println(countWords(words));

//  Задание №2

        PhoneBook phoneBook = new PhoneBook(100);
        phoneBook.add("Dmitriy", "89089089008");
        phoneBook.add("Dmitriy", "89149149149");
        phoneBook.add("Ivan", "89649649649");
        phoneBook.add("Alexey", "");
        phoneBook.printPhoneBook();
    }

    private static Map<String, Integer> countWords(String[] arr) {
        Map<String, Integer> map = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }
        return map;
    }

}
