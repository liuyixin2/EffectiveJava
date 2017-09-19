package assemblage;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Administrator on 2017-09-07.
 */
public class testLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        ListIterator<Integer> iterator = list.listIterator();
        System.out.println(iterator.next());
        iterator.add(4);
        System.out.println(iterator.next());
        iterator.add(5);

        ListIterator<Integer> iterator2 = list.listIterator();
        System.out.println(iterator2.next());
        iterator2.add(6);
        System.out.println(iterator2.next());
        iterator2.add(7);
        System.out.println("==========");
        for (Integer i: list) {
            System.out.println(i);
        }
    }
}
