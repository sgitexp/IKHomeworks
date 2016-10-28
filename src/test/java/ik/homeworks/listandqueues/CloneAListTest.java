package ik.homeworks.listandqueues;

import ik.homeworks.datastructures.SNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sukanta on 10/27/16.
 */
public class CloneAListTest {
    @Test
    public void testClone() throws Exception {

        SNode node1 = new SNode(3);
        SNode node2 = new SNode(7);
        SNode node3 = new SNode(2);
        SNode node4 = new SNode(4);
        SNode node5 = new SNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        node1.arbitPointer =node3;
        node2.arbitPointer = null;
        node3.arbitPointer = node5;
        node4.arbitPointer = node1;
        node5.arbitPointer = null;

        SNode clonedNode = CloneAList.clone(node1);
        assertEquals("Unable to clone a list with arbit pointer",CloneAList.getPrintString(node1),CloneAList.getPrintString(clonedNode));
    }

}