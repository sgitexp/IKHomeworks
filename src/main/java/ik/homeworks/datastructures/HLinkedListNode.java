package ik.homeworks.datastructures;

public class HLinkedListNode {

    public int val;
    public HLinkedListNode next;

    public HLinkedListNode(int node_value) {
        val = node_value;
        next = null;
    }


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
}