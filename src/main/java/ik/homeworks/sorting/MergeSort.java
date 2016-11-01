package ik.homeworks.sorting;


import java.util.Arrays;

/**
 * Created by sukanta on 10/30/16.
 */
public class MergeSort {


    public static int[] sort(int[] a) {
        return sort(a, 0, a.length);
    }

    private static int[] sort(int[] a, int start, int end) {

        if (a.length <= 1) 
            return a;
        int mid = (start + end) / 2;
        int[] p1 = Arrays.copyOfRange(a, start, mid);
        int[] p2 = Arrays.copyOfRange(a, mid, end);
        int[] m = merge (sort(p1), sort(p2));
        return m;
    }
    
    private static int[] merge (int[] a, int[] b) {
       
       int mSize = a.length + b.length;
       int[] m = new int[mSize];
       int aCounter = 0;
       int bCounter = 0;
       int mCounter = 0;
       
       while(aCounter<a.length && bCounter<b.length ) {
           if( a[aCounter] <= b[bCounter]) {
               m[mCounter++] = a[aCounter++];
           } else {
               m[mCounter++] = b[bCounter++];
           }
       }
       
       while( aCounter < a.length ) {
           m[mCounter++] = a[aCounter++];
       }
       
       while( bCounter < b.length ) {
           m[mCounter++] = b[bCounter++];
       }
       
       return m;
    }

}
