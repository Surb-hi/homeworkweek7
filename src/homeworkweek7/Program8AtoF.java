package homeworkweek7;

import java.util.Scanner;

public class Program8AtoF {

    public static char alphabet(char C) {//withperameterwithreturn method

        Scanner OBJ= new Scanner(System.in);//scan input form user
        System.out.println("Enter any Alphabet:");
        C = OBJ.next().charAt(0);

        if (C == 'a') {// condition for city name
            System.out.println("ashford");
        } else if (C == 'b') {
            System.out.println("bacton");
        } else if (C == 'c') {
            System.out.println("cornwall");
        } else if (C == 'd') {
            System.out.println("dalmally");
        } else if (C == 'e') {
            System.out.println("earlston");
        } else if (C == 'f') {
            System.out.println("fairoak");
        }
        return C;
    }
    public static void main(String[] args) {
        char C = 0;
        alphabet(C);

    }
}



