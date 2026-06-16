package Upskilling.CoreJava;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        float avg=(float)sum/n;
        System.out.println("\nSum : "+sum+"\nAverage : "+avg);
    }
}
