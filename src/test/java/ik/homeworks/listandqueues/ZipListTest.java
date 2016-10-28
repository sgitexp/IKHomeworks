package ik.homeworks.listandqueues;

import ik.homeworks.datastructures.HLinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sukanta on 10/28/16.
 */
public class ZipListTest {
    @Test
    public void testZip() throws Exception {

        HLinkedListNode n1 = new HLinkedListNode(1);
        HLinkedListNode n2 = new HLinkedListNode(2);
        HLinkedListNode n3 = new HLinkedListNode(3);
        HLinkedListNode n4 = new HLinkedListNode(4);
        HLinkedListNode n5 = new HLinkedListNode(5);
        HLinkedListNode n6 = new HLinkedListNode(6);

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