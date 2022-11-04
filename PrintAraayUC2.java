package com.bridgelabz.generics;

//Printing array using generic method

public class PrintAraayUC2 {
    private static <T> void toPrint(T[] inputArray) {
        for (T element : inputArray) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("___________Welcome to Printing Array using Java Generics___________");

        Integer[] a = { 1, 2, 3 };
        Double[] b = { 1.2, 1.2, 1.3 };
        Character[] c = { 'a', 'b', 'c' };

        toPrint(a);
        toPrint(b);
        toPrint(c);

    }

}
