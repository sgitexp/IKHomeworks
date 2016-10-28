package ik.homeworks.listandqueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SlidingWindow {

    public static int findMaxInRange(int a[], int from, int to) {
        if (a.length == 1) {
            return a[0];
        }
        int largest = a[from];
        for (int i = from; i < to; i++) {
            if (largest < a[i]) {
                largest = a[i];
            }
        }
        return largest;
    }

    public static int[] slideWindowAndFidMax(int[] a, int windowSize) {

        int from = 0;
        int to = from + windowSize;

        List<Integer> list = new ArrayList<Integer>();
        while (to < a.length) {
            list.add(findMaxInRange(a, from, to));
            from++;
            to++;
        }

        if (to >= a.length) {
            to = a.length;
            list.add(findMaxInRange(a, from, to));
        }

        int maxArray[] = new int[list.size()];
        int counter = 0;
        for (int i : list) {
            maxArray[counter++] = i;
        }

        return maxArray;

    }

    static int[] maxSlidingWindow(int[] nums, int k) {


        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] result = new int[nums.length - k + 1];

        LinkedList<Integer> deque = new LinkedList<Integer>();

        for (int i = 0; i < nums.length; i++) {

            //Remove an index which is outside the visible window
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.poll();
            }

            //Remove all indexes if the corresponding array element is lesser
            //than the array element pointed by i
            while ( !deque.isEmpty() && nums[ deque.peekLast() ] < nums[i] ) {
                deque.removeLast();
            }

            deque.offer(i);//only store the indexes rather than the elements at tail

            //Since the largest will be in the head
            if (i + 1 >= k) {
                result[i + 1 - k] = nums[deque.peek()];
            }
        }

        return result;
    }

    static int[] maxSlidingWindow2(int[] a, int k) {

        int result[] = new int[a.length - k + 1 ];
        int maxTillNow = findMaxInRange(a, 0, k);
        int rcounter = 0;
        result[rcounter++] = maxTillNow;

        for(int i = 1 ; i<a.length ; i++) {
            if( (i+k-1) > (a.length - 1) )break;
            if( a[i+k-1] > maxTillNow) maxTillNow = a[i+k-1];
            result[rcounter++] = maxTillNow;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int s = sc.nextInt();
        int[] a = new int[s];
        System.out.println("Start entering the elements : ");
        sc.nextLine();
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }

        sc.close();
        int mArray[] = maxSlidingWindow2(a, 3);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(mArray));
    }
}
