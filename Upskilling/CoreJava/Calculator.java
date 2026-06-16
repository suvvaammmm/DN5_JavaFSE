package Upskilling.CoreJava;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.println("enter the operator : ");
        char op = sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println("Addition : "+(a+b));
                break;
            case '-':
                System.out.println("Substraction : "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication : "+(a*b));
                break;
            case '/':
                if(b!=0){
                    System.out.println("Division : "+(a/b));
                    break;
                }
                else{
                    System.out.println("Cannot be Divisible");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}