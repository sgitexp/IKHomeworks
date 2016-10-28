package ik.homeworks.datastructures;

/**
 * Created by sukanta on 10/27/16.
 */
public class SNode {

    public Integer data;
    public SNode arbitPointer;
    public SNode next;

    public SNode(int data) {
        this.data = data;
        this.arbitPointer = null;
        this.next = null;
    }

}

