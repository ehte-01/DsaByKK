package LinkedList.Sorting;

import java.util.Scanner;

public class MergeSort {

    public static ListNode sortList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left , right);
    }

     static ListNode merge(ListNode list1 , ListNode list2){
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null){

            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }

        }

        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    static ListNode getMid(ListNode head){
        ListNode midPrev = null;

        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }

        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        if (n == 0) return;

        ListNode head = new ListNode(sc.nextInt());
        ListNode curr = head;

        for (int i = 0; i < n; i++) {
            curr.next = new ListNode(sc.nextInt());
            curr = curr.next;
        }

        head = sortList(head);

        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

}
