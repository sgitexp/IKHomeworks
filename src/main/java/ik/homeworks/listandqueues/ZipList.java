package ik.homeworks.listandqueues;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author chattops
 */
public class ZipList {

    public static class LinkedListNode {

        int val;
        LinkedListNode next;

        LinkedListNode(int node_value) {
            val = node_value;
            next = null;
        }
    }

    ;

    public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, LinkedListNode tail, int val) {
        if (head == null) {
            head = new LinkedListNode(val);
            tail = head;
        } else {
            tail.next = new LinkedListNode(val);
            tail = tail.next;
        }
        return tail;
    }

    /**
     * @param source
     * @param from   inclusive index
     * @param to     exclusive indec
     * @return LinkedListNode -- keeps the source intact
     */
    static LinkedListNode getNodesAsLinkedList(LinkedListNode source, int from, int to) {

        LinkedListNode p = null;
        LinkedListNode tmp = source;

        for (int i = 0; i < from; i++) {
            tmp = tmp.next;
        }

        for (int i = from; i < to; i++) {
            p = addToTail(p, tmp.val);
            tmp = tmp.next;
        }

        return p;
    }

    /**
     * Adds an element to tail
     *
     * @param node
     * @param value
     * @return
     */
    public static LinkedListNode addToTail(LinkedListNode node, int value) {

        LinkedListNode head = node;

        if (node == null) {
            node = new LinkedListNode(value);
            head = node;
        } else {
            while (node.next != null) node = node.next;
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
    static void print(LinkedListNode n) {

        if (n == null) {
            System.out.println("Empty List");
            return;
        }
        System.out.println("Printing....");
        while (n != null) {
            System.out.println(n.val);
            n = n.next;
        }

    }

    /**
     * zip a linked list
     *
     * @param pList
     * @return
     */
    static LinkedListNode Zip(LinkedListNode pList) {


        int pListLength = length(pList);
        int mid = pListLength / 2;

        LinkedListNode p1 = getNodesAsLinkedList(pList, 0, mid);
        LinkedListNode p2 = getNodesAsLinkedList(pList, mid, pListLength);
        p2 = reverseLinkedList(p2);
        LinkedListNode mList = mergeList(p1, p2);

        return mList;
    }

    /**
     * Find length of a linked List
     *
     * @param pList
     * @return
     */
    static int length(LinkedListNode pList) {

        //Iterate through the list by keeping a count
        int i = 0;
        LinkedListNode tmp = pList;
        while (tmp != null) {
            tmp = tmp.next;
            i++;
        }
        return i;
    }

    /**
     * Reverse a Linked List
     *
     * @param head
     * @return
     */
    static LinkedListNode reverseLinkedList(LinkedListNode head) {

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

    /**
     * Merge two lists
     *
     * @param l1
     * @param l2
     * @return
     */
    static LinkedListNode mergeList(LinkedListNode l1, LinkedListNode l2) {

        LinkedListNode head = l1;

        LinkedListNode tl1next = null;
        LinkedListNode tl2next = null;

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

        return head;
    }


}
