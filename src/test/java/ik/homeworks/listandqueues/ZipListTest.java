package ik.homeworks.listandqueues;

import ik.homeworks.datastructures.HLinkedListNode;
import ik.homeworks.datastructures.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sukanta on 10/28/16.
 */
public class ZipListTest {
    @Test
    public void testZip() throws Exception {

        LinkedListNode n1 = new LinkedListNode(1);
        LinkedListNode n2 = new LinkedListNode(2);
        LinkedListNode n3 = new LinkedListNode(3);
        LinkedListNode n4 = new LinkedListNode(4);
        LinkedListNode n5 = new LinkedListNode(5);
        LinkedListNode n6 = new LinkedListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        String expectedResult = "1,6,2,5,3,4,";
        ZipList.zip(n1);
        String actualResult = ZipList.getPrintString(n1);

        assertEquals(expectedResult, actualResult);
    }

}