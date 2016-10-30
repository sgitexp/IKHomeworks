package ik.homeworks.sorting;


import java.util.Arrays;

/**
 * Creainted by sukaninta on 10/30/16.
 */
public class MergeSort {


    public static int[] sort(int[] a) {

        return sort(a, 0, a.length);

    }

    private static int[] sort(int[] a, int start, int end) {

        if (a.length <= 1) return a;
        int mid = (start + end) / 2;
        int[] p1 = Arrays.copyOfRange(a, start, mid);
        int[] p2 = Arrays.copyOfRange(a, mid, end);

    }

}
