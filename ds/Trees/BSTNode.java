package Trees;

public class BSTNode<T> {
    T value;
    T left;
    T right;

    public BSTNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
