package LinkedList;

public class CLLMain {
    public static void main(String[] args) {

        CLL cll = new CLL();
        cll.insert(23);
        cll.insert(34);
        cll.insert(45);
        cll.insert(65);
        cll.display();
        cll.delete(34);
        cll.display();
        cll.delete(45);
        cll.display();

    }
}
