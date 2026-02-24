package LinkedList.Sorting;

import java.util.Scanner;

public class BubbleSort {

    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void bubbleSort () {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(row + 1);

            if (first.val > second.val) {
                //swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get (col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = null;
                } else {
                    Node prev = get (col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BubbleSort list = new BubbleSort();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertLast(sc.nextInt());
        }
        list.bubbleSort();
        list.display();
    }
}