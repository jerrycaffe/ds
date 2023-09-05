public class Main {
    public static int pow(int idx, int po) {
        if (po == 0)
            return 1;
        return idx * pow(idx, po - 1);
    }

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();

        sList.insert(20);
        sList.insert(30);
        sList.insert(10);
        // sList.insertFirst(100);
        // sList.insertAtPost(5000, 5);

        sList.printList();
        sList.deleteFromStart();
        sList.printList();
        System.out.println(sList.head.data);

        // System.out.println(pow(3, 3));
    }
}
