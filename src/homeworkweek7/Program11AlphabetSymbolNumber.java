package homeworkweek7;

import java.util.Scanner;

public class Program11AlphabetSymbolNumber {

    public void alphabetsymbol(){
        Scanner scanner = new Scanner(System.in);//scan user input

        System.out.println("Enter any caracter : ");
        char ch = scanner.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {// logic for number ,alphabet ,char

            System.out.println(ch + " is a alphabet ");

        } else if(ch >= '0' && ch <= '9') {

            System.out.println(ch + " is a number.");

        } else {

            System.out.println(ch + " is A SPECIAL CHARACTER.");
        }
    }

    public static void main(String[] args) {
    Program11AlphabetSymbolNumber obj=new Program11AlphabetSymbolNumber();
    obj.alphabetsymbol();
    }
}
