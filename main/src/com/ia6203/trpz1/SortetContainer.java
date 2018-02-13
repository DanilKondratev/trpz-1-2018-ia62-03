package com.ia6203.trpz1;

public class SortetContainer {

    public static void main(String[] args){
        System.out.println("Hello world!");
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++)
            array[i] = ((int)(Math.random()*1000)-0);

        selectionSort(array);

        for(int i=0; i< array.length;i++)
            System.out.print(array[i]+" ");
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }
}
