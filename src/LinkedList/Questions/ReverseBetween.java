package LinkedList.Questions;

import java.util.Scanner;

public class ReverseBetween {

    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

    ListNode prev = null;
    ListNode curr = head;

    for (int i = 0; curr != null && i < left - 1; i++) {
        prev = curr;
        curr = curr.next;
    }

    ListNode last = prev;
    ListNode newEnd = curr;

    // reverse between left and right
        ListNode next = curr.next;
        for (int i = 0; curr != null && i < right - left + 1; i++) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null){
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = curr;
        return head;
    }

    public static void display(ListNode head){
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        if (n == 0) return;

        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        int left =  sc.nextInt();
        int right = sc.nextInt();

        head = reverseBetween(head, left, right);
        display(head);
    }
}

