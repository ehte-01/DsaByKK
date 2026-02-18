package LinkedList.Questions;

public class RemoveDuplicates {

    private Node head;
    private Node tail;
    private int size;

    public RemoveDuplicates() {
        this.size = 0;
    }

    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertlast(int val){

        if (tail == null) {
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public void display() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node {

        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.insertlast(1);
        removeDuplicates.insertlast(1);
        removeDuplicates.insertlast(2);
        removeDuplicates.insertlast(2);
        removeDuplicates.insertlast(3);
        removeDuplicates.display();
        removeDuplicates.duplicates();
        removeDuplicates.display();

    }

}



