package homeworkweek7;

import java.util.Scanner;

public class Program9CityName {

        public static String getCityName(char C) {//withperameterwithreturntype
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any Alphabet");
            C = sc.next().charAt(0);

            String cityname = "";
            switch (C) {
                case 'a': case 'A':

                    cityname = "Acton";
                    break;
                case 'b':
                case 'B':
                    cityname = "Babcary";
                    break;
                case 'c':
                case 'C':
                    cityname = "Cambridge";
                    break;
                case 'd':
                case 'D':
                    cityname = "Dalavich";
                    break;
                case 'e':
                case 'E':
                    cityname = "Earl Shilton";
                    break;
                case 'f':
                case 'F':
                    cityname = "Fair isle";
                    break;
                default:
                    cityname = "Invalid entry";
                    break;
            }
            return cityname;


        }
    public static void main(String[] args) {
        char C = 0 ;
        // getCityName(C);
        System.out.println(getCityName(C));

    }
    }


