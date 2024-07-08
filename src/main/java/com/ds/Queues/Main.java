package src.main.java.com.ds.Queues;

public class Main {
    public static void main(String[] args) {
        Queues<Integer> q = new Queues<>();
        q.add(20);
        q.add(190);
        q.add(30);
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}
