import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {

        // LIFO Operation perform
        Stack<String>animals = new Stack<>();
        animals.push("Lion");
        animals.push("Horse");
        animals.push("Tiger");
        animals.push("Elephant");
        System.out.println(animals);

        System.out.println("Which element remove the list give us = "+animals.peek());

        System.out.println("Delete the values which waiting for get out = "+animals.pop());

        System.out.println(animals);

        System.out.println("Which element remove the list give us = "+animals.peek());

    }
}
