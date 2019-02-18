package com.example.shipkitworkshop;

/**
 * This class is for math operations.
 */
public class MathUtils {

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c
                && a + c > b
                && b + c > a;
    }
}
