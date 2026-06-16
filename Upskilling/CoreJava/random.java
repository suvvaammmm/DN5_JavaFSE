package Upskilling.CoreJava;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int ran = r.nextInt(100)+1;
        int guess=0;
        do{
            System.out.print("Enter the number : ");
            guess=sc.nextInt();
            if(guess>ran){
                System.out.println("Number is too high");
            }
            else if(guess<ran){
                System.out.println("Number is too low");
            }
            else{
                System.out.println("Congratulations.");
            } 
        }while(guess!=ran);
    }
}
