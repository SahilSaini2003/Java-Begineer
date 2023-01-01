import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class P28_Collections {
    public static void main(String[] args) {

        // ******** ORACLE is The Best Site to Read All The Methods Present In The collections ******* //

        // 1. ArrayList
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>(5); // Set Capacity
       
        a.add(10);
        a.add(13);
        a.add(15);
        a.add(17);
        a.add(2,19); // to add Element at Index
        System.out.println(a);

        a2.add(7);
        a2.add(3);
        a2.add(5);
        a2.add(1);
        System.out.println(a2);

        a2.addAll(a); // Adds To ArrayList
        System.out.println(a2);

        a2.addAll(0,a); // Adds To ArrayList at Desired Position.
        System.out.println(a2);
        
        a2.remove(0); // Remove Elements
        System.out.println(a2);

        Collections.sort(a2); // Sort
        System.out.println(a2);

        a2.clear(); // Empties ArrayList
        System.out.println(a2);

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }


        // 2. Linked List
        LinkedList<Integer> l = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>(); 

        l.add(10);
        l.add(13);
        l.add(15);
        l.add(17);
        l.add(0,19); // to add Element at Index
        System.out.println(l.iterator());
        System.out.println(l);

        l2.add(7);
        l2.add(3);
        l2.add(50);
        l2.add(14);
        l2.offer(23);
        l2.offerLast(111);
        l2.offerFirst(23);
        System.out.println(l2);
        l2.add(5,1);
        System.out.println(l2);


        // 3. Array De-Queue(Double Ended Queue)
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(4);
        q.add(3);
        ArrayDeque<Integer> q1 = new ArrayDeque<>(q);
        System.out.println("Queue 1");
        System.out.println(q);
        System.out.println("Queue 2");
        System.out.println(q1);


        // 4. Hash Set
        
        
        // 5. Hash Map

    }
}
