package String;

import java.util.Scanner;

public class String_Praktika3 {
    public static void main(String[] args) {
        boolean netice = foo2();
        System.out.println(netice);
    }

    public static boolean foo2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Soz daxil edin;");
        boolean b = true;
        String Soz = sc.nextLine();
        for (int i = 0; i < Soz.length(); i++) {
            char sol = Soz.charAt(i);
            char sag = Soz.charAt(Soz.length() - 1 - i);
            if (sol == sag) {
                return b;
            } else {
                b = false;
            }
        }
        return false;
    }
}
