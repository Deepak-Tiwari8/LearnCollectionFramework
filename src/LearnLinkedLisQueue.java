import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedLisQueue {

    public static void main(String[] args) {

        // FIFO Operation perform
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println(queue);

        System.out.println("Ticket line type working = "+queue.poll());

        System.out.println("Next element pop = "+queue.peek());
    }
}
