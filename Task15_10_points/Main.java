package com.company;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 4 };

        System.out.println(isStepEven(a));
    }

    public static boolean isStepEven(int[] array) {
        if (array.length < 2) return false;

        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i + 1] - array[i]) % 2 == 0) continue;
            return false;
        }

        return true;
    }
}