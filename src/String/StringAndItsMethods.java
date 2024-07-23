package String;

public class StringAndItsMethods {
    public static void main(String[] args) {
        String a = "Nicat";
        String b = "Alverdiyev";
        String c = "";
        char B = a.charAt(2);
        System.out.println(B);
        int uzunluq = a.length();
        System.out.println(uzunluq);
        String Birlrsdir = a.concat(b);
        System.out.println(Birlrsdir);
        System.out.println(a + " " + b);
        boolean e = a.contains("a");
        System.out.println(e);
        int r = a.indexOf("c");
        System.out.println(r);
        boolean w = c.endsWith("m");
        System.out.println(w);
        boolean t = c.isEmpty();
        System.out.println(t);
    }


}
