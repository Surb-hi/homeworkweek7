package homeworkweek7;

import java.util.Scanner;

public class Program16Checknumber {
    public static void main(String arr[])
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= obj.nextInt();
        Condition(n);

}
public static void Condition(int n){//withreturnwithperametr

    if(n>0)//condition for number
        System.out.println("Positive");
    else if(n<0)
        System.out.println("Negative");
    else
        System.out.println("Zero");
}
}
