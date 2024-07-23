package ArraysDersi;

import java.util.Random;
import java.util.Scanner;

public class Arrrays2Olcu1 {
    public static void main(String[] args) {
        int [][] array = new int [2][2];
        //Array daxil edilmesi hissesidir
        //urda ola biler
        //Scanner,Random,Math.random //// Her halda burda bu kimi methodlar la elave etmk olar.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Random num = new Random();
                //  array[i][j] = (int)(Math.random()*100);
                Scanner sc = new Scanner(System.in);
                array[i][j] = sc.nextInt();
            }
        }
        //Cap verilme hissesidir
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
