package ru.lakeevda.lesson2.homework;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] arr = {678, -45,  1, -65, 0, 43, 8, 23, 98, 34, -4};

        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }


}
