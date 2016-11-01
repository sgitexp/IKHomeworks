/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.homeworks.sorting;

/**
 *
 * @author sukanta
 */
public class QuickSort {
    
     public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(int a[], int low, int high) {

        if (high <= low) return;
        int partitionIndex = partition(a, low, high);
        sort(a, low, partitionIndex - 1);
        sort(a, partitionIndex + 1, high);

    }

    private static int partition(int a[], int low, int high) {

        int pIndex = low;

        while (true) {

            while (low <= high && a[low] <= a[pIndex])
                low++;

            while (low <= high && a[high] > a[pIndex])
                high--;

            if (low >= high)
                break;

            swap(a, low, high);
        }

        swap(a, high, pIndex);
        pIndex = high;
        return pIndex;

    }
    
    private static void swap(int[] a, int from, int to) {
        int temp = a[from];
        a[from] = a[to];
        a[to] = temp;
    }
}
