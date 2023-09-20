public class Main {
    public static int pow(int idx, int po) {
        if (po == 0)
            return 1;
        return idx * pow(idx, po - 1);
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> sList = new SinglyLinkedList<>();

        // sList.insert(20);
        // sList.insert(30);
        // sList.insert(10);
        // // sList.insertFirst(100);
        // // sList.insertAtPost(5000, 5);
        // sList.append(100);
        // sList.printList(); // 100 should be last
        // System.out.println(sList.tail.data);// should give 100
        // // sList.printList();
        // // sList.deleteFromStart();
        // sList.printList();
        // System.out.println(sList.head.data);

        // System.out.println(pow(3, 3));
        SinglyLinkedList<String> stringList = new SinglyLinkedList<>();
        stringList.insert("Ade");
        stringList.insert("Jeremiah");
        stringList.insert("adedamola");
        stringList.insert("omotola");
        stringList.insert("adebimpe");
        stringList.reverseList();
        ;
        stringList.printList();
    }
}
