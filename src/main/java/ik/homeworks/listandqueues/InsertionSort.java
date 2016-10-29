package ik.homeworks.listandqueues;

/**
 * Created by sukanta on 10/29/16.
 */
public class InsertionSort {


    public static <T extends Comparable> void sort(T[] a) {
        for (int i = 1; i < a.length; i++) {
            insert(a, a[i], i);
        }
    }

    private static <T extends Comparable> void insert(T[] a, T val, int position) {
        int i = position - 1;
        while (i >= 0 && greaterThan(a[i], val)) {
            a[i + 1] = a[i];
            i = i - 1;
        }
        a[i + 1] = val;
    }

    private static <T extends Comparable> boolean greaterThan(T a, T b) {
        int c = a.compareTo(b);
        return c > 0;
    }
}
