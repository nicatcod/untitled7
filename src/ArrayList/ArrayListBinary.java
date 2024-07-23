package ArrayList;

import java.util.*;

public class ArrayListBinary {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            list.add(random.nextInt(100));
            System.out.println(list);

        }
        //Collections.sort(list);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tapmaq istediyin ededi daxil et");
        int Element = scanner.nextInt();
int index = Collections.binarySearch(list, Element);
if (index !=-1) {
    System.out.println("Element tapildi _"+ Element +" " + index);

}
else {
    System.out.println("Element tapilmadi"+Element);
}
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println(" "+treeSet);
    }
    public static int binarySearch(ArrayList<Integer> list, int element) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (list.get(mid) < element) {
                low = mid + 1;
            }
            else if (list.get(mid) > element) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
