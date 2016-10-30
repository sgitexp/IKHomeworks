package ik.homeworks.listandqueues;

import ik.homeworks.datastructures.LinkedListNode;

/**
 * Created by sukanta on 10/29/16.
 */
public class AlternateNodeSplitter {

    public static void splitAlterNate(LinkedListNode n) {

        if (n == null && n.next == null) {
            System.out.println("Impossible to split");
        }

        LinkedListNode fp = n;
        LinkedListNode sp = n.next;

        LinkedListNode p1 = fp;
        LinkedListNode p2 = sp;


        while (fp != null && fp.next != null) {

            fp.next = fp.next.next;
            if (sp.next != null)
                sp.next = sp.next.next;
            fp = fp.next;
            sp = sp.next;

        }

        if (sp != null) {
            sp.next = null;
        }

        print(p1);
        print(p2);

    }

    private static void print(LinkedListNode n) {

        if (n == null) {
            System.out.println("Empty List");
            return;
        }

        while (n != null) {
            System.out.print(n.data + ",");
            n = n.next;
        }

        System.out.println();

    }
}
