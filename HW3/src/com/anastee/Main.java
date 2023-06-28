package com.anastee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{11, -5, 7, -1, 10, 14, -8, 5, -3, -6};

        checkEvenNumbers(array);

        maxAndMinNums(array);

        increaseDecreaseArray(array);

        System.out.println();

        switchPlaces(array);

        System.out.println();

        deleteMinAndMax(array);

        System.out.println();

        arithmeticMean(array);
    }

    public static void checkEvenNumbers(int[] array) {
        int sum = 0;
        int count = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                count++;
                sum += num;
            }
        }
        System.out.println("сумма: " + sum + ", кількість: " + count);
    }

    public static void maxAndMinNums(int[] array) {
        Arrays.sort(array);

        int minPositive = 0;
        int maxNegative = 0;

        for (int num : array) {
            if (num < 0) {
                maxNegative = num;
            } else {
                minPositive = num;
                break;
            }
        }
        System.out.println("Найбільше від'ємне число: " + maxNegative + ", найменше додатнє число: " + minPositive);
    }

    public static void increaseDecreaseArray(int[] array) {
        int[] resultArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                resultArray[i] = array[i] - 1;
            } else {
                resultArray[i] = array[i] + 1;
            }
        }

        for (int num :
                resultArray) {
            System.out.print(num + " ");
        }
    }

    public static void switchPlaces(int[] array) {
        int[] resultArray = new int[array.length];
        Arrays.sort(array);

        int min = array[0];
        int max = array[array.length - 1];

        System.arraycopy(array, 0, resultArray, 0, array.length);
        resultArray[0] = max;
        resultArray[resultArray.length - 1] = min;

        for (int num :
                resultArray) {
            System.out.print(num + " ");
        }
    }

    public static void deleteMinAndMax(int[] array) {
        int[] resultArray = new int[array.length - 2];
        Arrays.sort(array);

        System.arraycopy(array, 1, resultArray, 0, array.length - 1 - 1);

        for (int num :
                resultArray) {
            System.out.print(num + " ");
        }
    }

    public static void arithmeticMean(int[] array) {
        int arithmetic = 0;
        int amountOfNums = array.length;

        for (int num :
                array) {
            arithmetic += num;
        }
        arithmetic = arithmetic / amountOfNums;

        System.out.print("Середнє арифметчне: " + arithmetic);

        int countBigger = 0;

        for (int num :
                array) {
            if (num >= countBigger) {
                countBigger++;
            }
        }
        System.out.println(", Чисел більше за арифметичне: " + countBigger);
    }
}
