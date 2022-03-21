import java.util.Scanner;

//Write a java program that tells us that Input number is odd or even
public class Program1ternary {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = obj.nextInt();
        System.out.println("Number is :" +evenodd(num));

    }
        public static String evenodd (int num) {
            String result = num % 2 == 0 ? "Even" : "Odd";//ternary operator
            return result;
        }
}
