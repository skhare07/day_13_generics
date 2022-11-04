package com.bridgelabz.generics;

//printing array using generic class

public class PrintArrayUC3 <T> {
    private T[] inputArray;

    public PrintArrayUC3(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public void toPrint(){
        PrintArrayUC3.toPrint(this.inputArray);
    }

    private static <E> void toPrint (E[] inputArray){
        for(E element : inputArray){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integerArray = { 1, 2, 3 };
        Double[] doubleArray = { 1.2, 1.2, 1.3 };
        Character[] characterArray = { 'a', 'b' ,'c' };
        new PrintArrayUC3(integerArray).toPrint();
        new PrintArrayUC3(doubleArray).toPrint();
        new PrintArrayUC3(characterArray).toPrint();

    }

}

