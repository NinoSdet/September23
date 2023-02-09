package January25.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {


    public static void main(String[] args) {



        LinkedList<String > linkedList = new LinkedList<>();

        linkedList.add("hello");
        linkedList.add("hi");
        linkedList.add("hola");

        linkedList.addFirst("bonjour");
        linkedList.addLast("guten tag");
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);

    }
}
