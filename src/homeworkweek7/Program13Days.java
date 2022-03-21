package homeworkweek7;

import java.util.Scanner;

public class Program13Days {

    public static String getDayName(int day) {//withreturnwithperameter method

        String dayName = "";
        switch (day) {//switcg statement for days

            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day range";
        }

        return dayName;
    }

    public static void main(String[] args) {
        Scanner OBJ = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = OBJ.nextInt();
        System.out.println(getDayName(day));
    }
}