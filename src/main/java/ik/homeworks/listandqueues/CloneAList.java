package ik.homeworks.listandqueues;


import ikhomework.datastructures.SNode;

/**
 *
 * @author chattops
 */
public class CloneAList {

    /**
     * @param SNode
     * @return
     */
    private static SNode copySNode(SNode SNode) {
        SNode temp = new SNode(SNode.data);
        return temp;
    }

    /**
     * Create a copy of SNode and insert it in between n and n+1
     *
     * @param head
     * @return
     */
    private static SNode createAndInsert(SNode head) {

        SNode tmpHead = head;
        while (tmpHead != null) {
            SNode newSNode = copySNode(tmpHead);
            newSNode.next = tmpHead.next;
            tmpHead.next = newSNode;
            tmpHead = tmpHead.next.next;
        }
        return head;
    }

    private static SNode copyArbitaryPointers(SNode head){
        SNode tmp = head;
        while( head != null) {
            //arbit ponter of inserted copy = next element of the element pointed by the head pointer
            //it is true as the next element is always the copy of the previous one
            if(head.next != null && head.arbitPointer!= null)
                head.next.arbitPointer = head.arbitPointer.next;

            head = head.next.next;

        }
        return tmp;
    }

    private static SNode restoreOriginalAndReturnClone(SNode head) {

        SNode original = head;
        SNode clonetmp = head.next;
        SNode clone = head.next;

        while( original != null && original.next != null && clonetmp != null && clonetmp.next!= null) {
            original.next = original.next.next;
            clonetmp.next = clonetmp.next.next;

            original = original.next;
            clonetmp = clonetmp.next;
        }

        original.next = null;
        return clone;
    }

    public static void print( SNode SNode) {

        SNode tmp = SNode;
        while( tmp != null) {
            System.out.print("[" + tmp.data + "]");
            tmp =tmp.next;
        }
        System.out.println("");
        tmp = SNode;
        while( tmp != null) {
            if(tmp.arbitPointer != null)
                System.out.print("[" + tmp.arbitPointer.data + "]");
            tmp = tmp.next;
        }
        System.out.println("======================================");
    }

    public static String getPrintString( SNode SNode) {

        StringBuffer buffer = new StringBuffer("");
        SNode tmp = SNode;
        while( tmp != null) {
            buffer.append("[" + tmp.data + "]");
            tmp =tmp.next;
        }
        buffer.append("-");
        tmp = SNode;
        while( tmp != null) {
            if(tmp.arbitPointer != null)
                buffer.append("[" + tmp.arbitPointer.data + "]");
            tmp = tmp.next;
        }
        return buffer.toString();
    }

    public static SNode clone( SNode head) {
        head = createAndInsert(head);
        head = copyArbitaryPointers(head);
        SNode clone = restoreOriginalAndReturnClone(head);
        return clone;
    }


}

