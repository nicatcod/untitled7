package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringBuilderTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sozu daxil et");
        String input = scanner.nextLine();
        List<String> lis = Arrays.asList(input.split("\\s+"));
        String ara = "-";
        String b = "";
        StringBuilder Boyukherif = new StringBuilder();
        for (int i = 0; i < lis.size(); i++) {
            String list = lis.get(i);
            String Ab= list.substring(0, 1).toUpperCase() + list.substring(1);
            b = b.concat(Ab);
            if (i < lis.size() - 1) {
               b += ara;
            }
        }
        System.out.println(b);
////        list.add("hello");
////        list.add("world");
////        list.add("java");
////        list.add("programming");
//        String Ara = "-";
//        String result = lis.stream().map(lis - > lis.substring(0, 1)
//                .toUpperCase() + lis.substring(1)).collect(Collectors.joining(Ara));
//
//        System.out.println(result);

    }
}
