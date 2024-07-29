package Inheritance;

public class MathUtil {
    public MathUtil(){
    }
    public MathUtil(String name){
        System.out.println("Salam brooo");
    }
    //Super Class
    public void getTopla(int a, int b){
        System.out.println(a+b);
    }
    public void getVurma(int a, int b){
        System.out.println(a*b);
    }
    public void getCixma(int a, int b){
        System.out.println(a-b);
    }
    public void getBolme(int a, int b){
        System.out.println(a/b);
    }

}
