package homeworkweek7;

import java.util.Scanner;

public class Program20Array {

    public static void main(String[] args) {
        getvalue();//calling static method in main method directly
    }

    //static method
    public static void getvalue() {
        boolean result = false;
        Scanner OBJ = new Scanner(System.in);
        System.out.println("Enter number to be tested");
        int n = OBJ.nextInt();
        System.out.println("Enter the value of array size");
        int asize = OBJ.nextInt();
        System.out.println("Enter the all values:");
        int barray[] = new int[asize];

        for (int i = 0; i < asize; i++) {// logic
            barray[i] = OBJ.nextInt();
        }
        for (int i = 0; i < asize; i++) {
            if (barray[i] == n) {
                result = true;
                break;
            }
        }
        if(result)
            System.out.println("The array contains entered value");
        else
            System.out.println("The array do not contain the entered value");

    }
}