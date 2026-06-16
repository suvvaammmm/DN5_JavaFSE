package Upskilling.CoreJava;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuilder sb = new StringBuilder(a);
        sb.reverse(); 
        System.out.println(sb);
    }
}


/*Loop

String rev = "";
for(int i=a.length()-1;i>=0;i--){
   rev+=a.charAt(i);
} 

*/