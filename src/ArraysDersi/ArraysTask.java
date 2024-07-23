package ArraysDersi;

import java.util.Scanner;

public class ArraysTask {
    public static void main(String[] args) {
        int[] arr = new int[5];// {0,0,0,0,0} bu Yazilis ile eynidir.
        // Daxil etme hissesi
for (int i = 0; i < arr.length; i++) {
    Scanner sc = new Scanner(System.in);
    System.out.println((i+1)+" Ededi daxil edin");
    arr[i] = sc.nextInt();


}

        System.out.println("Array asagidaki kimidir");

//Capa verilme hissesi
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
