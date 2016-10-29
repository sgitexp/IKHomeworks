package ik.homeworks.listandqueues;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by sukanta on 10/29/16.
 */
public class InsertionSortTest {

    @Test
    public void sort() throws Exception {

        Integer[] a = {6, 5, 10, -1, 7, 9};
        Integer[] b = {6, 5, 10, -1, 7, 9};

        Arrays.sort(b);
        InsertionSort.sort(a);

        assertArrayEquals(a, b);
    }

}