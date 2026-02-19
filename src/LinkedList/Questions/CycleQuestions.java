package LinkedList.Questions;

public class CycleQuestions {

     public boolean hasCycle(ListNode head) {

         ListNode fast = head;
         ListNode slow = head;

         while (fast != null && fast.next != null) {
             fast = fast.next.next;
             slow = slow.next;

             if (fast == slow) {
                 return true;
             }
         }
         return false;
     }

    public int lengthCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode temp = slow;
                int  length = 0;
                do{
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                    return length;
            }
        }
        return 0;
    }



     static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        CycleQuestions list = new CycleQuestions();

        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-1);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = head;

        System.out.println(list.hasCycle(head));
        System.out.println(list.lengthCycle(head));

    }
}
