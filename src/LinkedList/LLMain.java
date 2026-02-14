package LinkedList;

public class LLMain {

    public static void main(String[] args) {

        LL list  = new LL();
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(8);
        list.insertfirst(17);
        list.insertlast(1);
        list.insertlast(0);
        list.insert(23,2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();

    }
}
