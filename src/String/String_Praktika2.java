package String;

import java.util.Scanner;

public class String_Praktika2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n-ededin daxiledin");
        int n = sc.nextInt();
        System.out.println("m-ededin daxiledin");
        int m = sc.nextInt();
        n = n + m;
        m = n - m;
        n = n-m;
        System.out.println("n"+n+ " " +"m="+m);

    }
}
