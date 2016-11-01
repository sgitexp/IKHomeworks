package ik.homeworks.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by sukanta on 10/30/16.
 */
public class MergeSortTest {
    @Test
    public void sort() throws Exception {

        int[] a = {1, -5, 6, 8, 9, 24, 7, 5, 89};
         int[] b = MergeSort.sort(a);
        System.out.println(Arrays.toString(b));
    }

}