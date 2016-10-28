package ik.homeworks.listandqueues;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import ik.homeworks.datastructures.HLinkedListNode;

/**
 * @author chattops
 */
public class ZipList {

    /**
     * Adds an element to tail
     * @param node
     * @param value
     * @return
     */
    private static HLinkedListNode addToTail(HLinkedListNode node, int value) {

        HLinkedListNode head = node;

        if (node == null) {

            node = new HLinkedListNode(value);
            head = node;

        } else {

            while (node.next != null)
                node = node.next;

            HLinkedListNode tmp = new HLinkedListNode(value);
            node.next = tmp;
        }

        return head;
    }

    /**
     * Prints an linked List
     * @param n
     */
    public static String getPrintString(HLinkedListNode n) {

        StringBuffer buffer = new StringBuffer();

        if (n == null) {
            return null;
        }

        while (n != null) {
            buffer.append(n.val).append(",");
            n = n.next;
        }

        return buffer.toString();
    }

    /**
     * zip a linked list
     * @param pList
     * @return
     */
    public static void zip(HLinkedListNode pList) {

        HLinkedListNode p1 = pList;
        HLinkedListNode p2 = null;

        //Split a list in two parts
        HLinkedListNode sp = pList;
        HLinkedListNode fp = pList.next;

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
    private static HLinkedListNode reverseLinkedList(HLinkedListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        HLinkedListNode p1 = head;
        HLinkedListNode p2 = p1.next;

        head.next = null;
        while (p1 != null && p2 != null) {
            HLinkedListNode t = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = t;
        }

        return p1;
    }

    /**
     * Merge two lists
     *
     * @param l1
     * @param l2
     * @return
     */
    private static void mergeList(HLinkedListNode l1, HLinkedListNode l2) {

        HLinkedListNode head = l1;

        HLinkedListNode tl1next = null;
        HLinkedListNode tl2next = null;

        while (l1 != null && l2 != null) {

            tl1next = l1.next;
            tl2next = l2.next;
            l2.next = l1.next;
            l1.next = l2;
            l1 = tl1next;
            l2 = tl2next;

        }

        if (l1 != null) {
            while (l1 != null) {
                head = addToTail(head, l1.val);
                l1 = l1.next;
            }
        }

        if (l2 != null) {
            while (l2 != null) {
                head = addToTail(head, l2.val);
                l2 = l2.next;
            }
        }


    }


}
