package ik.homeworks.listandqueues;

import ik.homeworks.datastructures.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sukanta on 10/28/16.
 */
public class MergeSortLinkedListTest {
    @Test
    public void mergeSort() throws Exception {

        LinkedListNode n1 = new LinkedListNode(1);
        LinkedListNode n2 = new LinkedListNode(6);
        LinkedListNode n3 = new LinkedListNode(9);
        LinkedListNode n4 = new LinkedListNode(2);
        LinkedListNode n5 = new LinkedListNode(7);
        LinkedListNode n6 = new LinkedListNode(11);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;


        LinkedListNode sotedList = MergeSortLinkedList.mergeSort(n1);

        String expectedResult = "1,2,6,7,9,11,";
        String actualResult = MergeSortLinkedList.getPrintString(n1);
        assertEquals(expectedResult, actualResult);
    }

}