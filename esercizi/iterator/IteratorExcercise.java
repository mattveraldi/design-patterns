package esercizi.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExcercise {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);

        Iterator<Integer> iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
