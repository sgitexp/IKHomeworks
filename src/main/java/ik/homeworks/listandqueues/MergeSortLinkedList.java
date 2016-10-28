package ik.homeworks.listandqueues;

import ik.homeworks.datastructures.LinkedListNode;

/**
 * Created by sukanta on 10/28/16.
 */
public class MergeSortLinkedList {

    private static LinkedListNode mergeSortedList(LinkedListNode l1, LinkedListNode l2) {

        LinkedListNode head = new LinkedListNode(-1);
        LinkedListNode p = head;

        LinkedListNode p1 = l1;
        LinkedListNode p2 = l2;

        while (p1 != null && p2 != null) {

            if (p1.data < p2.data) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }

            p = p.next;
        }

        if (p1 != null) p.next = p1;
        if (p2 != null) p.next = p2;

        return head.next;
    }

    public static LinkedListNode mergeSort(LinkedListNode n) {

        if (n == null || n.next == null) {
            return n;
        }

        //Two parts
        LinkedListNode p1 = n;
        LinkedListNode p2 = null;

        //Split a list in two parts
        LinkedListNode sp = n;
        LinkedListNode fp = n.next;

        while (fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
        }
        p2 = sp.next;
        sp.next = null;

        //merge both list
        return mergeSortedList(mergeSort(p1), mergeSort(p2));

    }

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
}
