package ArrayList;

import javax.swing.*;
import javax.xml.namespace.QName;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            list.add(random.nextInt(100));
        }
        Collections.sort(list);

        System.out.println(list);
    }
}



