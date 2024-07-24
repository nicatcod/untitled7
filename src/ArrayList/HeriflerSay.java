package ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HeriflerSay {
    //1) String line = "AZERBAIJAN";
    //2) Sözdəki hərfləri və onların sayın HashMap a yazırıq
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sözü daxil edin:");
        String Herif = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char HERIF : Herif.toCharArray()) {
            if (map.containsKey(HERIF)) {
                map.put(HERIF, map.get(HERIF) + 1);

            } else {
                map.put(HERIF, 1);
            }

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
