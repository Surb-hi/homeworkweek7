package homeworkweek7;

public class Program12Number1to100{

    //static method
    public static void number() {
        int n;
        System.out.println("\nDivided by 3");
        for (n = 1; n < 100; n++) {//logic for number divided by 3
            if (n % 3 == 0)
                System.out.print(n + ",");
        }
        System.out.println("\nDivided by 5");
        for (n = 1; n < 100; n++) {//logic for number divided by 5
            if (n % 5 == 0)
                System.out.print(n + ",");
        }
    }

    public static void main(String[] args) {
            number();

        }
}
