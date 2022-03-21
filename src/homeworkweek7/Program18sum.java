package homeworkweek7;

import java.util.Scanner;

public class Program18sum {

    public void avg() {
        Scanner obj = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        System.out.println("Enter the elements:");
        for (int i=0; i<10; i++)
        {
            array[i] = obj.nextInt();
        }
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:"+sum);
    }

    public static void main(String[] args) {
        Program18sum OBJ=new Program18sum();
        OBJ.avg();

    }
}


