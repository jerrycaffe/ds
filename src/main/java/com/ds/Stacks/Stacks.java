package src.main.java.com.ds.Stacks;

/**
 * @version 0.01
 *          LIFO - Last In First Out principal
 *          The last element added is the first element to be removed. e.g
 *          plates stacked, the very top to be removed
 * @author Jerrycaffe
 */

public class Stacks<T> {
    int top;
    StackNode<T> current;

    Stacks() {
        this.top = -1;
        current = null;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public T push(T data) {
        StackNode<T> newData = new StackNode<>(data);
        if (isEmpty()) {
            this.current = newData;
        } else {

            StackNode<T> temNode = this.current;
            this.current = newData;
            this.current.prev = temNode;
        }
        this.top++;
        return this.current.data;

    }

    public T peek() {
        if (isEmpty())
            return null;
        return this.current.data;
    }

    public T pop() {
        if (isEmpty())
            return null;

        StackNode<T> tempCurrent = this.current;
        this.current = tempCurrent.prev;
        this.top--;
        return tempCurrent.data;

    }

}
