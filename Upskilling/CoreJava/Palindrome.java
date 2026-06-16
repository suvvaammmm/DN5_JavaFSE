package Upskilling.CoreJava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        str = str.replaceAll("[^a-zA-z0-9]","").toLowerCase();
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println("Palindrome");
        } 
        else{
            System.out.println("Not Palindrome");
        }
    }
}
