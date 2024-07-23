package String;

import java.util.Scanner;

public class String_Praktika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededleri daxil edin");
        int eded = sc.nextInt();
        int cem = 0;
       while (eded > 0) {
           int qaliq = eded%10;
           cem = cem + qaliq;
            eded = eded/10;
        }

        System.out.println("Cavab"+cem);
    }
}
