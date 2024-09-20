package practice_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcepts {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("orange");
        set.add("guava");

        System.out.println(set.contains("Apple")); // Output: true
        System.out.println(set.remove("Apple")); // true
        System.out.println(set.size()); // Output: 1
        System.out.println(set); // [orange, guava, Banana]

        // get the iterator over the element in the set


       Iterator<String> iterator =  set.iterator();
       while (iterator.hasNext()){
          // String element = iterator.next();
           if("guava".equalsIgnoreCase(iterator.next())){
               iterator.remove();
           }
       }

        System.out.println(set);

    }
}

//    iterator(): Returns an Iterator for the Set allowing traversal of elements.
//        hasNext(): Checks if there are more elements.
//        next(): Retrieves the next element. -- return type is String
//        remove(): Removes the current element from the Set during iteration.