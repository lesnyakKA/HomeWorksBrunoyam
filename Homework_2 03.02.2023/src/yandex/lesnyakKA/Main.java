package yandex.lesnyakKA;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("ArrayUtil.reduceEvenElement(String[] array)");
        String[] arrayString = new String[]{"first", "second", "third", "fourth"};
        System.out.println(Arrays.toString(ArrayUtil.reduceEvenElement(arrayString)));

        System.out.println("ArrayUtil.reduceEvenElement(int[] array)");
        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(ArrayUtil.reduceEvenElement(arrayInt)));

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("ArrayUtil.doSpecifiedOperations(int[] array, ArithmeticOperations.ADDITION");
        System.out.println(ArrayUtil.doSpecifiedOperations(array, ArithmeticOperations.ADDITION));

        System.out.println("ArrayUtil.doSpecifiedOperations(int[] array, ArithmeticOperations.MULTIPLICATION)");
        System.out.println(ArrayUtil.doSpecifiedOperations(array, ArithmeticOperations.MULTIPLICATION));

        System.out.println("ArrayUtil.doSpecifiedOperations(int[] array, ArithmeticOperations.AVERAGE_VALUE)");
        System.out.println(ArrayUtil.doSpecifiedOperations(array, ArithmeticOperations.AVERAGE_VALUE));
    }
}