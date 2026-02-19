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

    public ListNode detectCycle(ListNode head) {
         int length = 0;

         ListNode fast = head;
         ListNode slow = head;

         while (fast != null && fast.next != null) {
             fast = fast.next.next;
             slow = slow.next;
             if (fast == slow) {
                 length = lengthCycle(slow);
                 break;
             }
         }

         if (length == 0) {
             return null;
         }

         // find the start node
         ListNode f = head;
         ListNode s = head;

         while (length >0){
             s = s.next;
             length--;
         }

         // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
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
