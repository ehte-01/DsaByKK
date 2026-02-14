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

    }
}
