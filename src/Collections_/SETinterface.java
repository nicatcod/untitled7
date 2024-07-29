package Collections_;

import java.util.HashSet;
import java.util.Iterator;

public class SETinterface {
    public static void main(String[] args) {
//Set interface
        HashSet set = new HashSet();
        set.add("Nicat");
        set.add(true);
        set.add(123);
        set.add("Nicat");

    //set.forEach((element) -> System.out.println(element));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
        }
    }
}

