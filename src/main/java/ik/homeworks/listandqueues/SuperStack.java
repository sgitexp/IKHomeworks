package ik.homeworks.listandqueues;

/**
 * Created by sukanta on 10/28/16.
 */
public class SuperStack {

    public int top = -1;
    private int size = 0;
    private int[] array;

    public SuperStack(int size) {

        this.size = size;
        this.array = new int[this.size];

    }

    public void push(int element) {

        if (top < size)
            this.array[++top] = element;
        printTop();
    }

    private void printTop() {

        if (top < 0)
            System.out.println("EMPTY");
        else
            System.out.println(this.array[top]);

    }

    public int pop() {

        int e = (top >= 0) ? this.array[top--] : null;
        printTop();
        return e;

    }

    public void incr(int numberOfElements, int incrementAmount) {
        for (int i = 0; i < numberOfElements; i++) {
            this.array[i] = this.array[i] + incrementAmount;
        }
    }


}
