package homeworkweek7;

import java.util.Scanner;

public class Program7CalculateCommission {

    public double testcommission() {
        Scanner commission = new Scanner(System.in);//scan user input
        System.out.println("Enter amount:");
        double amount = commission.nextInt();//amount object
        System.out.println("Enter commissionPercentage:");
        double commissionPercentage = commission.nextDouble();// logic for commission
        double commission1 = (commissionPercentage / 100) * amount;
        return commission1;
    }

    public static void main(String[] args) {
        Program7CalculateCommission obj=new Program7CalculateCommission();
        System.out.println("Commission amount=" +obj.testcommission());//call testcommission method
    }
}

