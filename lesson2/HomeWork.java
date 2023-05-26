package ru.gb.lesson2;

import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {

        int[] A = { 1, 2, 3, 2, 1, 2, 3, 4, 4, 4, 2, 3, 3, 1, 2, 3, 4, 4, 2, 1, 3, 4, 2, 1, 1 };

        int[] B = { 3, 5, 3, 5, 3 };

        CountSort(A);
        CountSort(B);

        // [1 2 3 2 1 2 3 4 4 4 2 3 3 1 2 3 4 4 2 1 3 4 2 1 1]
        // 1 -> 5 Единица встречается 5 раз (! ЧИСЛО ВЗЯТО С ПОТОЛКА!)
        // 2 -> 7 Двойка встречается 7 раз
        // 3 -> 3
        // 4 -> 5

        // Вставляем единицу 5 раз, потом двойку 7 раз, потом тройку 3 три раза, потом
        // четверку 5 раз
    }

    /**
     * Реализовать сортировку подсчетом.
     *
     */
    public static void CountSort(int[] array) {
        int max = maxValue(array);
        int[] numCount = new int[max + 1];

        for (int num : array) {
            numCount[num]++;
        }

        int sorted[] = new int[array.length];
        int index = 0;

        for (int i = 0; i < numCount.length; i++) {
            for (int j = 0; j < numCount[i]; j++) {
                sorted[index] = i;
                index++;
            }

        }
        System.out.println(Arrays.toString(sorted));

    }

    public static int maxValue(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
