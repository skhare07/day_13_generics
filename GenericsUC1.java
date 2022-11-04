package com.bridgelabz.generics;

public class GenericsUC1 {
    private static void toPrint(Integer[] a) {

        for (int element : a) {
            System.out.println(element);
        }

    }

    // double array printing
    private static void toPrint(Double[] b) {

        for (double element : b) {
            System.out.println(element);
        }

    }

    // character array printing
    private static void toPrint(Character[] c) {

        for (char element : c) {
            System.out.println(element);
        }

    }

    public static void main(String[] args) {

        Integer[] a = { 1, 2, 3 };
        Double[] b = { 1.2, 1.2, 1.3 };
        Character[] c = { 'a', 'b', 'c' };
        toPrint(a);
        toPrint(b);
        toPrint(c);

    }
}
