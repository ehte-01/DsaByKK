package LinkedList.Questions;

import java.util.Scanner;

public class ReverseLinkedList {

    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode reverse(ListNode head){

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

    public static void display(ListNode head){
        while (head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print("End");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) { return; }

        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;
        for (int i = 1; i < n; i++) {
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }

        display(head);
        head = reverse(head);

        while (head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print("END");

    }
}
