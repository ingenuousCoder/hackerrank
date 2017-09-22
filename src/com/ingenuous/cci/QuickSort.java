package com.ingenuous.cci;

import java.util.Arrays;

public class QuickSort {

    public static void main(String args[]) {
        int unsortedArray[] = {5,8,32,1,643,21,67,2,1,56, 0};
        //int unsortedArray[] = {6,3,1,2,5};
        quickSort(unsortedArray, 0, unsortedArray.length-1);
        System.out.println(Arrays.toString(unsortedArray));

    }

    public static void quickSort (int array[], int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return;
        }
        int pivot = array[(leftIndex + rightIndex) / 2];
        int index = partition(array, leftIndex, rightIndex, pivot);
        quickSort(array, leftIndex, index-1);
        quickSort(array, index, rightIndex);
    }

    public static int partition(int array[], int leftIndex, int rightIndex, int pivot){
        while(leftIndex <= rightIndex) {
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }

            while (array[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(array, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        return leftIndex;
    }

    public static void swap(int array[], int leftIndex, int rightIndex){
        int tmp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = tmp;
    }
}
