import java.util.ArrayList;
import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(24);
        list.add(36);
        list.add(48);

        System.out.println(list);

        System.out.println("Check value present or not = "+list.contains(48));

        for (Integer i :list) {
            System.out.println("LinkedList value of = "+ i);
        }
    }

}
