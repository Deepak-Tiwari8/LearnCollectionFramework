import java.util.ArrayDeque;
import java.util.Queue;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>ad = new ArrayDeque<>();
        ad.offer(23);
        ad.offerFirst(12);
        ad.offerLast(64);
        ad.offer(43);

        System.out.println(ad);

        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());


        System.out.println(ad.poll());
        System.out.println("Poll = "+ad);

        System.out.println(ad.pollFirst());
        System.out.println("Poll First = "+ad);

        System.out.println(ad.pollLast());
        System.out.println("Poll Last = "+ad);

    }
}


