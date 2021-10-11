package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2};
        int[] array2 = {3,4};

        System.out.println(Arrays.toString(concat(array1.length, array1, array2.length, array2)));
    }

    public static int[] concat(int array1Length, int[] array1, int array2Length, int[] array2) {
        int[] newArray = new int[array1Length + array2Length];

        for (int i = 0; i < array1Length; i++) {
            newArray[i] = array1[i];
        }

        for (int i = 0; i < array2Length; i++) {
            newArray[array1Length + i] = array2[i];
        }

        return newArray;
    }
}
