package ru.gb.jcore.hw_2;

/*
1. Написать метод, возвращающий количество чётных элементов массива.
 countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
2. Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 4, 0, 0, -3};
        System.out.println(countEvens(arr));
        System.out.println(difference(arr));
        System.out.println(searchNullValues(arr));
    }


    private static int countEvens(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int difference(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        return max - min;
    }

    private static boolean searchNullValues(int[] arr) {
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 0 && arr[i] == 0) {
                flag = true;
            }
        }
        return flag;
    }
}
