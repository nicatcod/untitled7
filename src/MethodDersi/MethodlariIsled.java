package MethodDersi;

import java.util.Scanner;

public class MethodlariIsled extends Methods {
    public static void main(String[] args) {
        MethodlariIsled M = new MethodlariIsled();

        System.out.println("Elementleri daxil edin;" + "\n1.Toplama " + "\n2.Cixma" + "\n3.Vurma" + "\n4.Bolme");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        {
         //   if (element >= 1 && element <= 4)

                System.out.println("a ededini daxiledin");
            int a = sc.nextInt();

            System.out.println("b ededini daxiledin");
            int b = sc.nextInt();


            switch (element) {
                case 1:
                    int cem = M.topla(a, b);
                    System.out.println(cem);
                    break;
                case 2:
                    int cix = M.cix(a, b);
                    System.out.println(cix);
                    break;
                case 3:
                    long vurma = M.vurma(a, b);
                    System.out.println(vurma);
                    break;
                case 4:
                    if (b != 0) {
                        double bolme = M.bolme(a, b);
                        System.out.println(bolme);
                    } else {
                        System.out.println("0-Bolme yoxdur");
                    }
                    break;

                default:
                    System.out.println("Elementleri duzgun daxiledin");

                    break;

            }
        }
    }
}


//        if (element == 1) {
//          int cvb=  M.topla(a, b);
//            System.out.println(cvb);
//        } else if (element == 2) {
//           int cvb= M.cix(a, b);
//            System.out.println(cvb);
//        } else if (element == 3) {
//            int cvb= M.vurma(a, b);
//            System.out.println(cvb);
//        } else if (element == 4) {
//            double cvb= M.bolme(a, b);
//            System.out.println(cvb);
//
//        }


//}
//
//    public static void topla(int a, int b) {
//        int cem = a + b;
//        System.out.println("cem;" + cem);
//    }
//
//    public static void cix(int a, int b) {
//        int cix = a - b;
//        System.out.println("cix;" + cix);
//    }
//
//    public static void vurma(int a, int b) {
//        int vurma = a * b;
//        System.out.println("vurma;" + vurma);
//    }
//
//    public static void bolme(int a, int b) {
//        double bolme = a / b;
//        System.out.println("bolme;" + bolme);
//    }
//}
