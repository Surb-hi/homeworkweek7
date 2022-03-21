package homeworkweek7;

import java.util.Scanner;

public class Program4leapyear2 {

    public static int leapyear(int x) {
        int year=x;//veriable decleartion
        if (x>0 && x<9999) {//condition to check o to 9999 number
            if (x % 400 == 0) {//condition for leap year
                System.out.println("Year is leap year");
            } else if ((x % 400 == 0) && (x % 100 != 0)) {
                System.out.println("Year is leap year");
            } else if ((x % 400 == 0) && (x % 100 != 0) && (x % 100 == 0)) {
                System.out.println("Year is a leap year");
            } else {
                System.out.println("Year is  not a leap year");
            }}else{
                System.out.println("Year is not a valid entry");
            }
            return year;
        }

        public static int getdaysinmonth(int month ,int year) {////withreturnwithperamter method
            int daysinmonth = 0;

            switch (month) {//swich statement dor days in month
                case 1: //jan
                case 3://mar
                case 5://may
                case 7://july
                case 8://aug
                case 10://oct
                case 12://dec
                    daysinmonth = 31;
                    break;
                case 4://apr
                case 6://jun
                case 9://sept
                case 11://nov
                    daysinmonth = 30;
                    break;
                case 2://feb
                    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                        daysinmonth = 29;
                    } else {
                        daysinmonth = 28;
                    }
                    break;
                default:
                    System.out.println("return -1");
                    break;
            }
            return daysinmonth;
        }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year1=obj.nextInt();
        leapyear(year1);
        System.out.println("Enter a month");
        int month1= obj.nextInt();
        //int year2 = obj.nextInt();
        System.out.println(getdaysinmonth(month1,year1));
    }
}

