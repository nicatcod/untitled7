package Collections_;

import java.util.ArrayList;

public class LISTinterface {
    public static void main(String[] args) {
        ArrayList yemekler = new ArrayList();

        yemekler.add("Salat");
        yemekler.add("Dolma");
        yemekler.add("Kabab");
        yemekler.add("Salat");
yemekler.add(0,"Bozbas");
yemekler.remove(0);
yemekler.remove("Salat");
        yemekler.forEach((e)->System.out.println(e));


    }
}
