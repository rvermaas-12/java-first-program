package com.h2;

public class App {
    public static void main(String[] args) {

    }

    public static int doubleTheNumber(int number) {
        return 2 * number;
    }

    private static int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
