package yandex.lesnyakKA;

import java.util.Arrays;

public class ArrayUtil {
    public static String[] reduceEvenElement(String[] array) {
        String[] result = new String[array.length / 2];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                continue;
            }
            result[count] = array[i];
            count++;
        }
        return result;
    }

    public static int[] reduceEvenElement(int[] array) {
        int[] result = new int[array.length / 2];
        for (int i = 0; i < array.length; i++) {
            if(i % 2 != 0) {
                result[i/2] = array[i];
            }
        }
        return result;
    }

    public static double doSpecifiedOperations(int[] array, ArithmeticOperations operation) {
        int result = 0;

        switch (operation) {
            case ADDITION:
                result = Arrays.stream(array)
                        .sum();
                break;

            case MULTIPLICATION:
                result = 1;
                for(int element: array) {
                    result *= element;
                }
                break;
            case AVERAGE_VALUE:
                result = (int) Arrays.stream(array)
                        .average().orElse(Double.NaN);
                break;
        }
        return result;
    }
}
