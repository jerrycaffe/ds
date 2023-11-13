package Trees;

public class BST {
    BSTNode root;

    public BST() {
        this.root = null;
    }

    /**
     * @param data value to be inserted
     *             Create a new node
     *             Starting at the root
     *             check if there is a root, if not - the root created becomes the
     *             new node
     *             else check if the value of the new node is greater than or less
     *             than the value of the root
     *             if it is greater - check to see if there is a node to the right
     *             - if there is, move to that node and repeat these steps
     *             - if there is not, add that node as the right property
     *             if it is less
     *             - check to see if there is a node to the left
     *             - - if there is, move to that node and repeat these steps
     *             - - if not add the node as the left property
     * 
     * @see <a
     *      href=https://www.geeksforgeeks.org/insertion-in-binary-search-tree/>
     *      Insertion in Binary Search Tree (BST) </a>
     * @return void
     */
    public BSTNode insert(Integer value) {
        BSTNode newNode = new BSTNode(value);
        if (this.root == null) {
            this.root = newNode;
            return this.root;
        }
        BSTNode currentNode = this.root;
        while (true) {
            if (value == currentNode.value)
                return null;
            if (value < currentNode.value) {
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    return this.root;
                } else {
                    currentNode = currentNode.left;
                }
            } else if (value > currentNode.value) {
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    return this.root;
                } else {
                    currentNode = currentNode.right;
                }

            }
        }
    }
}
