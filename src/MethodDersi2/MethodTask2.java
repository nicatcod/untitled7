package MethodDersi2;

import java.util.Scanner;

public class MethodTask2 {
    public static void main(String[] args) {
        System.out.println("Elementi secin"
                + "\n1.Topla"
                + "\n2.Cix"
                + "\n3.Vur"
                + "\n4.Bol");
        Scanner sc = new Scanner(System.in);
        int Elemetler = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("a - ededini daxil edin");
        int a = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("b - ededini daxil edin");
        int b = sc.nextInt();
        if (Elemetler == 1) {
            Topla(a, b);
        } else if (Elemetler == 2) {
            Cix(a, b);
        } else if (Elemetler == 3) {
            Vur(a, b);

        } else if (Elemetler == 4) {
            Bol(a, b);
        }
    }

    public static void Topla(int a, int b) {
        int cem = a + b;
        System.out.println("Topla " + cem);

    }

    public static void Cix(int a, int b) {
        int Qismet = a - b;
        System.out.println("Cix " + Qismet);
    }

    public static void Vur(int a, int b) {
        int Hasil = a * b;
        System.out.println("Vur " + Hasil);
    }

    public static void Bol(double a, double b) {
       double Netice = a / b;
        System.out.println("Bol " +Netice);
    }
}

