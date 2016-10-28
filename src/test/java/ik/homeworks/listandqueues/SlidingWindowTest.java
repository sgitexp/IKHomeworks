package ik.homeworks.listandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sukanta on 10/27/16.
 */
public class SlidingWindowTest {

    @Test
    public void maxSlidingWindow() throws Exception {

        int k = 3;
        int[] nums = {2, 1, 5, 4, 7, -1, 10};
        int[] expectedResult = {5, 5, 7, 7, 10};
        int[] actualResult = SlidingWindow.maxSlidingWindow(nums, k);
        assertArrayEquals(expectedResult, actualResult);

    }

}