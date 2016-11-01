/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.homeworks.sorting;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sukanta
 */
public class QuickSortTest {
    
   @Test
    public void sort() throws Exception {

        int[] a = {1, -5, 6, 8, 9, 24, 7, 5, 89};
        QuickSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
    
}
