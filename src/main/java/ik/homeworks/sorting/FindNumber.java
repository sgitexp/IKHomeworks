package ik.homeworks.sorting;

/**
 * Created by sukanta on 10/31/16.
 */
public class FindNumber {

    public static boolean contains(int[] a, int key) {
        return contains(a, 0, a.length - 1, key);
    }

    private static boolean contains(int[] a, int s, int e, int key) {

        if (e <= s) return false;

        int pIndex = partition(a, s, e);

        if (a[pIndex] == key) {
            return true;
        } else if (key < a[pIndex]) {
            return contains(a, s, pIndex - 1, key);
        } else {
            return contains(a, pIndex + 1, e, key);
        }

    }

    private static int partition(int a[], int s, int e) {
        int p = a[s];
        int pIndex = s;
        while (true) {
            while (s <= e && a[s] <= p)
                s++;
            while (s <= e && a[e] >= p)
                e--;

            if (s >= e)
                break;

            swap(a, s, e);
        }

        swap(a, pIndex, e);
        return e;
    }

    private static void swap(int a[], int from, int to) {
        int temp = a[from];
        a[from] = a[to];
        a[to] = temp;
    }
}
