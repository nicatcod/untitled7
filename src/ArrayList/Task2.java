package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Strinq daxil ededk (q daxil olanda dayan)");
            String input = scanner.nextLine();
            list.add(input);
            if (input.equals("q")) {
                break;
            }
        }
        System.out.println(list);
        System.out.println("Axtardigin  elementi daxil et");
        String element = scanner.nextLine();
        if (list.contains(element)) {
            System.out.println("Element  " + element + " tapildi");
        } else System.out.println("Element tapilmadi");
        System.out.println("Silmek istediyinelementi daxil ed");
        String string = scanner.nextLine();
        if (list.contains(string)) {
            System.out.println("Eleman silindi");
            list.remove(list.remove(string));
            System.out.println(list);
        } else {
            System.out.println("element liste yoxdur");
        }
    }
}
