package LinkedList.Questions;

import java.util.Scanner;

public class ReorderList {

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse (slow.next);
        slow.next = null;

        ListNode first = head;
        while (second != null) {

            ListNode t1 = first.next;
            ListNode t2 = second.next;

            first.next = second;
            second.next = t1;

            first = t1;
            second = t2;
        }
    }

    private static ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    static class ListNode{
        int val;
        ListNode next;

        ListNode (int val){
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (n == 0) return;

        ListNode head = new ListNode (sc.nextInt());
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        reorderList(head);
        display(head);
    }

}
