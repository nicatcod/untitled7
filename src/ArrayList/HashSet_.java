package ArrayList;

import java.util.HashSet;
import java.util.Iterator;
public class HashSet_ {
    //1) HashSet<String> yaradırsız
    //2) Add names to the HashSet
    //3) Check if a specific name exists in the HashSet
    //4) Remove a name from the HashSet
    //5) İterate through the HashSet and print all names
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");
        String name = "A";
        if (set1.contains(name)) {
            System.out.println("Var " + name);
        } else {
            System.out.println("Yoxdur" + name);
        }
        String name1 = "B";
        if (set1.remove(name1)) {
            System.out.println("Silindi " + name1);
        } else {
            System.out.println("Yoxdur " + name1);
        }
        System.out.println("Elementler");
        Iterator<String> iterator = set1.iterator();
        System.out.println(set1);


        HashSet<String> set2 = new HashSet<>();
        set2.add("A");
        set2.add("B");
        set2.add("C");
        set2.add("D");
        set2.add("E");


        HashSet<String> set3 = new HashSet<>();
        set3.addAll(set1);
        set3.addAll(set2);
        System.out.println(set3 + "set3 budu");

        HashSet<String> set4 = new HashSet<>();
        set4.add("A");
        set4.add("E");
        set4.retainAll(set1);
        System.out.println(set4);

    }
}