package DeepSkilling.DSA.FinancialForecast;

import java.util.Scanner;

public class FinancialForecast {
    public static double forecast(double amt , double rate , int years){
        if(years==0){
            return amt;
        }
        return forecast(amt*(1+rate),rate,years-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the amount : ");
        double amt = sc.nextDouble();
        System.out.print("Enter the rate : ");
        double rate = sc.nextDouble();
        System.out.print("Enter the years : ");
        int years = sc.nextInt();

        double FutureValue = forecast(amt, rate/100, years);
        double ROI = ((FutureValue-amt)/amt)*100;
        System.out.printf("Predicted Amount : %.2f\n",FutureValue);
        System.out.printf("ROI : %.2f in %d years",ROI,years);
    }
}
