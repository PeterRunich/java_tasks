package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 3, 5 };

        System.out.println(Arrays.toString(addInArray(a, 5)));
    }

    public static int[] addInArray(int[] array, int number) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = number;

        return newArray;
    }
}
