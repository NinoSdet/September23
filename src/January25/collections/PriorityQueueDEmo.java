package January25.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDEmo {

    public static void main(String[] args) {


        Queue<String> students = new PriorityQueue<>();

        students.offer("Maksym");
        students.offer("Nazrin");
        students.offer("Nazar");
        students.offer("Zaur");
        students.offer("Nilufar");
        students.offer("Erick");
      //  students.offer(null);

        System.out.println(students);

        while (!students.isEmpty()){  // in PQ the items will be retrieved based on the priority
            System.out.println(students.poll());
        }
    }
}
