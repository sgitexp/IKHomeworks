package ik.homeworks.listandqueues;

import ik.homeworks.datastructures.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sukanta on 10/29/16.
 */
public class AlternateNodeSplitterTest {
    @Test
    public void splitAlterNate() throws Exception {

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
        n5.next = null;

        n5.next = n6;
        n6.next = null;


        AlternateNodeSplitter.splitAlterNate(n1);

    }

    @Test
    public void splitAlterNate2() throws Exception {

        LinkedListNode n1 = new LinkedListNode(1);
        LinkedListNode n2 = new LinkedListNode(6);
        LinkedListNode n3 = new LinkedListNode(9);
        LinkedListNode n4 = new LinkedListNode(2);
        LinkedListNode n5 = new LinkedListNode(7);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        AlternateNodeSplitter.splitAlterNate(n1);

    }

}