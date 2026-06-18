package Upskilling.CoreJava;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        try{
            int result = m/n;
            System.out.println("Result "+result);
        }catch(ArithmeticException e){
            System.out.println("Invalid Input");
        }
    }    
}
