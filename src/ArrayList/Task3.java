package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> Ededler = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            Ededler.add(rand.nextInt(100));
        }
        System.out.println("Random ededler: " + Ededler);
        int C = B(Ededler);
        System.out.println("2-Ci boyuk eded: " + C);
    }

    public static int B(ArrayList<Integer> list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("2 eded nomresi uygun geleres xeta var ");
        }
        Collections.sort(list);

        return list.get(list.size() - 2);
    }
}


