package ik.homeworks.listandqueues;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import ik.homeworks.datastructures.LinkedListNode;

/**
 * @author chattops
 */
public class ZipList {

    /**
     * Adds an element to tail
     *
     * @param node
     * @param value
     * @return
     */
    private static LinkedListNode addToTail(LinkedListNode node, int value) {

        LinkedListNode head = node;

        if (node == null) {

            node = new LinkedListNode(value);
            head = node;

        } else {

            while (node.next != null)
                node = node.next;

            LinkedListNode tmp = new LinkedListNode(value);
            node.next = tmp;
        }

        return head;
    }

    /**
     * Prints an linked List
     *
     * @param n
     */
    public static String getPrintString(LinkedListNode n) {

        StringBuffer buffer = new StringBuffer();

        if (n == null) {
            return null;
        }

        while (n != null) {
            buffer.append(n.data).append(",");
            n = n.next;
        }

        return buffer.toString();
    }

    /**
     * zip a linked list
     *
     * @param pList
     * @return
     */
    public static void zip(LinkedListNode pList) {

        LinkedListNode p1 = pList;
        LinkedListNode p2 = null;

        //Split a list in two parts
        LinkedListNode sp = pList;
        LinkedListNode fp = pList.next;

        while (fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
        }
        p2 = sp.next;
        sp.next = null;

        //reverse a list
        p2 = reverseLinkedList(p2);

        // merge two list
        mergeList(p1, p2);

        pList = p1;
    }


    /**
     * Reverse a Linked List
     *
     * @param head
     * @return
     */
    private static LinkedListNode reverseLinkedList(LinkedListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode p1 = head;
        LinkedListNode p2 = p1.next;

        head.next = null;
        while (p1 != null && p2 != null) {
            LinkedListNode t = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = t;
        }

        return p1;
    }


    private static LinkedListNode mergeList(LinkedListNode l1, LinkedListNode l2) {

        LinkedListNode head = new LinkedListNode(-1);
        LinkedListNode p = head;

        LinkedListNode p1 = l1;
        LinkedListNode p2 = l2;

        while (p1 != null && p2 != null) {

            p.next = p1;
            p1 = p1.next;
            p = p.next;

            p.next = p2;
            p2 = p2.next;
            p = p.next;
        }

        if (p1 != null) p.next = p1;
        if (p2 != null) p.next = p2;

        return head.next;
    }


}
