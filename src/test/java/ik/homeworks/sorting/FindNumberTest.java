package ik.homeworks.sorting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sukanta on 10/31/16.
 */
public class FindNumberTest {
    @Test
    public void findP() throws Exception {
        int ks[] = {1, -9, 7, 80, 77, 786, 2, 5, 26, 52, -5, -7, 3};
        int searchKey = 77;
        boolean isPresent = FindNumber.contains(ks, searchKey);
        assertEquals(isPresent, true);
    }

    @Test
    public void findN() throws Exception {
        int ks[] = {1, -9, 7, 80, 77, 786, 2, 5, 26, 52, -5, -7, 3};
        int searchKey = 25;
        boolean isPresent = FindNumber.contains(ks, searchKey);
        assertEquals(isPresent, false);
    }

}