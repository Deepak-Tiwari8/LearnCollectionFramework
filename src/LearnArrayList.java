import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {
        // Default size of ArrayList is 10  If your arraylist full that time this formula used // n = n+n/2+1;
        ArrayList<Integer>list = new ArrayList<>();
        list.add(12);
        list.add(24);
        list.add(36);
        list.add(48); // Add method always add element at the end
        System.out.println(list);
        System.out.println(list.contains(24));
        list.add(2,60);
        System.out.println(list);
        ArrayList<Integer>newList = new ArrayList<>();
        newList.add(123);
        newList.add(163);

        list.addAll(newList);
        System.out.println(list);
        System.out.println(list.get(0));
         list.remove(3);
        System.out.println(list);

        list.remove(Integer.valueOf(12));
        System.out.println(list);

        list.clear();
        System.out.println(list);

        list.set(2,100);
        System.out.println(list);

         // There are three ways to get the values

        // Using normal for loop also use here
        for (int i = 0 ; i<list.size(); i++)
        {
            System.out.println("List element is = "+list.get(i));
        }

        // Using Foreach we can fetch or get values also
        for (Integer i :list) {
            System.out.println("List value of = "+ i);
        }

      // Using Iterator interface through we can fetch or get values
        Iterator<Integer> it = list.iterator();

        while (it.hasNext())
        {
            System.out.println("Iterator = "+it.next());
        }

    }
}
