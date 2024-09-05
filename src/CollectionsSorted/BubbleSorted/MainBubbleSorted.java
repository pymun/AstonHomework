package CollectionsSorted.BubbleSorted;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MainBubbleSorted {
    public static void main(String[] args) {
        int [] array = {3, 6, 7, 1, 9, 5, 2, 8, 4};
        System.out.println(Arrays.toString(array));
        BubbleSorted sortedArray = new BubbleSorted(array);
        int [] s = sortedArray.sort();
        System.out.println(Arrays.toString(s));

        ArrayList<Person> people = new ArrayList<>();
        Person mark = new Person("Mark", 18);
        Person maxim = new Person("Maxim", 25);
        Person bob = new Person("Bob", 43);
        people.add(mark);
        people.add(maxim);
        people.add(bob);
        System.out.println(people.toString());
        PersonComparator comp = new PersonComparator();
        people.sort(comp);
        for (Person p : people) {
            System.out.println(p.getName());
        }
    }
}
