package CollectionsSorted;

import java.util.LinkedList;

public class MainCustomLinkedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add("Help");
        list.add("WWW");
        list.add("You");
        System.out.println(list.toString());

        list.remove(0);
        System.out.println(list.toString());

        Object s = list.get(1);
        System.out.println(s.toString());

        CustomLinkedList newList = new CustomLinkedList();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        list.addAll(newList);
        System.out.println(list.toString());

    }
}
