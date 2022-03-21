package homeworkweek7;

import java.util.Scanner;

public class Program6oddeven {

    static int num;

    public static void oddeven(){
        Scanner OBJ=new Scanner(System.in);//scan user input
        System.out.println("Enter a number:");
        int num = OBJ.nextInt();//number object
        if(num % 2 == 0)// condition for even/odd
            System.out.println(num + " is even");
        else
            System.out.println(num+ " is odd");
    }

    public static void main(String[] args) {

        oddeven();
    }
}
