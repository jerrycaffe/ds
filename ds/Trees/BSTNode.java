package Trees;

/**
 * @author Adeleye jeremiah
 * 
 *         Binary Search Trees work
 *         1. Every parent node has at most two children .i.e than can have less
 *         than 2 but must not be more than 2
 *         2. Every node to the left of a parent node is always less than the
 *         parent
 *         3. Every node to the right of a parent node is always greater than
 *         the parent
 */
public class BSTNode {
    Integer value;
    BSTNode left;
    BSTNode right;

    public BSTNode(Integer value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

}
