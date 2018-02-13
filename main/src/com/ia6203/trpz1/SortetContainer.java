package com.ia6203.trpz1;

import java.util.Arrays;
import java.util.Random;

public class SortetContainer {

    static int[] quickArray;

    public static void quickSort() {
        quickArray=new int[200];
        Random rand=new Random();
        for(int i=0;i<quickArray.length;i++){
            quickArray[i]=rand.nextInt(200);
        }

        Arrays.stream(quickArray).forEach((item)-> {
            System.out.print(item+" ");
        });
        System.out.println();


        int startIndex = 0;
        int endIndex = 200 - 1;
        doSort(startIndex, endIndex);

        Arrays.stream(quickArray).forEach((item)-> {
            System.out.print(item+" ");
        });
    }

    private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (quickArray[i] <= quickArray[cur])) {
                i++;
            }
            while (j > cur && (quickArray[cur] <= quickArray[j])) {
                j--;
            }
            if (i < j) {
                int temp = quickArray[i];
                quickArray[i] = quickArray[j];
                quickArray[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }

    public static void main(String[] args){

        System.out.println("Hello world!");
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++)
            array[i] = ((int)(Math.random()*1000)-0);

        selectionSort(array);

        for(int i=0; i< array.length;i++)
            System.out.print(array[i]+" ");
      
        quickSort();
      
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
