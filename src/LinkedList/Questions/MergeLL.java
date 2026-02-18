package LinkedList.Questions;

public class MergeLL {

    private Node head;
    private Node tail;
    private int size;

    public MergeLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {

        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {

        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public static MergeLL merge(MergeLL first, MergeLL second ) {
        Node f =  first.head;
        Node s = second.head;

        MergeLL ans = new MergeLL();

        while (f != null && s != null){
            if (f.val <= s.val) {
                ans.insertLast(f.val);
                f = f.next;
            } else {
                ans.insertLast(s.val);
                s = s.next;
            }
        }

        while (f != null){
            ans.insertLast(f.val);
            f = f.next;
        }

        while (s != null){
            ans.insertLast(s.val);
            s = s.next;
        }
        return ans;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp= temp.next;
        }
        System.out.print("END");
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

    public static void main(String[] args) {

        MergeLL first = new MergeLL();
        MergeLL second = new MergeLL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        MergeLL ans = MergeLL.merge(first, second);
        ans.display();

    }
}
