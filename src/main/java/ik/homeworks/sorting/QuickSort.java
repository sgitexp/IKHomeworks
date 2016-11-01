/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.homeworks.sorting;

/**
 * @author sukanta
 */
public class QuickSort {


    public static <T extends Comparable> void sort(T[] a) {
        sort(a, 0, a.length - 1);
    }

    private static <T extends Comparable> void sort(T[] a, int start, int end) {

        if (end <= start)
            return;

        int partition = partition(a, start, end);
        sort(a, start, partition - 1);
        sort(a, partition + 1, end);
    }

    private static <T extends Comparable> int partition(T[] a, int start, int end) {

        T pivot = a[start];
        int pIndex = start;

        while (true) {

            while (start <= end && lessThanEquals(a[start], pivot)) {
                start++;
            }

            while (start <= end && greaterThan(a[end], pivot)) {
                end--;
            }

            if (start >= end)
                break;

            swap(a, start, end);
        }

        swap(a, pIndex, end);
        return end;
    }

    private static <T extends Comparable> boolean lessThanEquals(T a, T b) {
        int s = a.compareTo(b);
        return s <= 0;
    }


    private static <T extends Comparable> boolean greaterThan(T a, T b) {
        int s = a.compareTo(b);
        return s > 0;
    }

    private static <T extends Comparable> void swap(T[] a, int from, int to) {
        T temp = a[from];
        a[from] = a[to];
        a[to] = temp;
    }
}
