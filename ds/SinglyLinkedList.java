public class SinglyLinkedList {

    public Node head = null;
    public Node tail = null;
    private int size = -1;

    // Insert to the beginning
    // insert at the given location
    // reverse list

    // delete from the beginning
    // delet from the end
    // delete from a given location

    // return max value from list
    // search value in singly list

    public void insertFirst(int data) {
        if (this.head == null)
            insert(data);

        Node newNode = new Node(data);
        Node temp = this.head;
        newNode.next = temp;
        this.head = newNode;
        this.size = size + 1;
    }

    public Node insert(int data) {
        Node newValue = new Node(data);
        this.size = size + 1;
        if (this.head == null) {
            this.head = newValue;
            this.tail = newValue;
            return newValue;
        }

        Node currentNode = this.head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newValue;
        this.tail = newValue;
        return tail;
    }

    public void insertAtPost(int data, int location) {
        // if list is empty and location is not 0 return error
        // location is greater than the size + 1, of list, return error
        if (this.size == -1 && location == 0 || location - 1 > this.size) {
            System.out.println("ListOutOfBoundsException You cannot insert into position" + location
                    + "as the current size is " + this.size);

        }

        // keep track of previous and current node
        // create a new node
        // let the next of previous point to the node of newly created
        // let the next of newly created point to the current node
        int currentPos = 0;
        Node prevNode = this.head;
        Node newNode = new Node(data);
        Node currentNode = this.head;
        while (currentPos != location - 1) {
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentPos++;
        }
        prevNode.next = newNode;
        newNode.next = currentNode;
        this.size++;
        if (newNode.next == null)
            this.tail = newNode;

    }

    public int deleteFromStart() {
        // if head is null return -1
        // if head.next is null, set head to null and tail to null then return head.data
        // hence new head is head.next
        int data = this.head.data;
        if (this.head == null)
            return -1;
        if (this.head.next == null) {
            this.head = null;
            this.tail = null;

        } else {
            Node newHead = this.head.next;
            this.head = newHead;
        }
        this.size--;
        return data;

    }

    public void reverseList() {

    }

    public void printList() {
        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("End of the List");
    }

    public int getListCount() {
        return size + 1;
    }
}
