package homeworkweek7;

import java.util.Scanner;

public class Program2leapyear {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);//scann value form user
        System.out.println("Enter a year:");
        int year=obj.nextInt();
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))//logic of program
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
    }
}
