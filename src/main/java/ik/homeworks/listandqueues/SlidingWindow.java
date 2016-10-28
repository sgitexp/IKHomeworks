package ik.homeworks.listandqueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SlidingWindow {

    private static int findMaxInRange(int a[], int from, int to) {
        if (a.length == 1) {
            return a[0];
        }
        int largest = a[from];
        for (int i = from; i < to; i++) {
            if (largest < a[i]) {
                largest = a[i];
            }
        }
        return largest;
    }


    public static int[] maxSlidingWindow(int[] a, int k) {

        int result[] = new int[a.length - k + 1];
        int maxTillNow = findMaxInRange(a, 0, k);
        int rcounter = 0;
        result[rcounter++] = maxTillNow;

        for (int i = 1; i < a.length; i++) {
            if ((i + k - 1) > (a.length - 1)) break;
            if (a[i + k - 1] > maxTillNow) maxTillNow = a[i + k - 1];
            result[rcounter++] = maxTillNow;
        }

        return result;
    }
}

