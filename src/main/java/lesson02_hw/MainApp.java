package lesson02_hw;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;


public class MainApp {

    public static void main(String[] args) {
        String[][] array1 = new String[4][4];
        String[][] array2 = new String[4][7];
        try {
            doApp(array1);
            doApp(array2);
        } catch (MyArraySizeException | MyArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void doApp(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (!Arrays.deepEquals(array, new String[4][4])) {
            throw new MyArraySizeException("Wrong array size");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = String.valueOf((int) (Math.random() * 10));
            }
        }
//      Для проверки NumberFormatException меняем значение ячейки и проходим циклом по массиву еще раз для подсчета
//      суммы и имитации ошибки

//        array[2][1] = "+";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (!NumberUtils.isCreatable(array[i][j])) {
                    throw new MyArrayDataException("Wrong argument in cell " + i + " " + j);
                }
                sum += Integer.parseInt(array[i][j]);
            }
        }
        System.out.println("Sum of array is : " + sum);
    }
}


