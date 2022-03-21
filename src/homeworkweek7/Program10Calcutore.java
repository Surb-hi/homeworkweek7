package homeworkweek7;

import java.util.Scanner;
public class Program10Calcutore {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);//Scan user input

        float num1, num2, result;//veriable decleation
        char ch;

        System.out.println("Enter any Two Numbers: ");
        num1 = scan.nextFloat();//object creation
        num2 = scan.nextFloat();
        System.out.println("Enter the Operator (+, -, *, /): ");
        ch = scan.next().charAt(0);
        if(ch == '+') {//logic for operation perform
            result = num1 + num2;
        } else if(ch == '-'){
            result = num1 - num2;
        } else if(ch == '*'){
            result = num1 * num2;
        } else if(ch == '/') {
            result = num1 / num2;
        }else {
            System.out.println("\nInvalid Input");
            return;
        }
        System.out.println("\nResult = " + result);
    }
}


