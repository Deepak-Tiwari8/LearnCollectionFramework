import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

    public static void main(String[] args) {
        // Default Min Heap as working means Smallest element always ready to remove
        PriorityQueue<Integer>li = new PriorityQueue<>(Comparator.reverseOrder());
        li.offer(8);
        li.offer(-3);
        li.offer(6);
        li.offer(4);
        System.out.println(li);

        System.out.println("Smallest values by default remove = "+li.poll());

        System.out.println("Next value for ready remove "+li.peek());

        System.out.println(li);


        System.out.println("Largest values  remove = "+li.poll());

        System.out.println("Next value for ready remove "+li.peek());

        System.out.println(li);
    }
}
