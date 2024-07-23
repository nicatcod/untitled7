package ArraysDersi;

import java.util.Scanner;

public class Arrays2Olcu {
    public static void main(String[] args) {

        int[][] arr = new int[2][5];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ededi daxil edin:");
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}

