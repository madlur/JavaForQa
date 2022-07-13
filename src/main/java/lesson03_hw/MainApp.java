package lesson03_hw;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

//  Задание 1: Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

        Integer arr1[] = {1, 2, 3, 4, 5};
        String arr2[] = {"A", "B", "C"};
        swap(arr1, 1, 4);
        swap(arr2, 0, 2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

//  Задание 2: Задача про коробки

        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        orangeBox.addFruit(new Orange(), 10);
        appleBox.addFruit(new Apple(), 8);
        appleBox1.addFruit(new Apple(), 4);

        appleBox.move(appleBox1);
        orangeBox.move(orangeBox);

    }

    public static void swap(Object[] arr, int element1, int element2) {
        Object temp = arr[element1];
        arr[element1] = arr[element2];
        arr[element2] = temp;
    }

}
