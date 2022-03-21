package homeworkweek7;

import java.util.Arrays;

public class Program17NumarrayStringarray {

    public void Array() {
        int[] my_array1 = {
                1111, 2222, 3333, 4444, 5555,
                1010, 9999, 8888, 7777, 6666,
                1011, 2020, 3030, 4040};

        String[] my_array2 = {
                "add", "sum", "divi", "multi", "reminder", "percentage"};

        System.out.println("Original numeric array : " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));

        System.out.println("Original string array : " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));
    }

    public static void main(String[] args) {
        Program17NumarrayStringarray OBJ = new Program17NumarrayStringarray();
        OBJ.Array();
    }
}

