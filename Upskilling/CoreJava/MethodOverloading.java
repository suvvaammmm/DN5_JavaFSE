package Upskilling.CoreJava;

public class MethodOverloading {
    public static int add(int a ,int b){
        return a+b;
    }
    public static double add(double a , double b){
        return a+b;
    }
    public static int add(int a,int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("Addition : "+add(1,3));
        System.out.println("Addition : "+add(2, 2.555555));
        System.out.println("Addition : "+add(1, 2, 3));
    }
}
