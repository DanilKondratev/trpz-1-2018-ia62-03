package com.ia6203.trpz1;

public class SortetContainer {

    public static void main(String[] args){
        System.out.println("Hello world!");

    }

    public static void bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
