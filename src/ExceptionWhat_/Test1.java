package ExceptionWhat_;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter nema");
      String nema = sc.nextLine();
      if(nema==""){
        throw new Exception("Xeta var");
      }
      System.out.println(nema);
    }
}
