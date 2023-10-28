package homework4;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        int[] arr = {4, 3, 3, 1, 15, 7, 4, 19, 1, 1, 17};
        int min = arr[4];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min =arr[i];
                min = i++;
                System.out.println("Min is:" + " " + min);
                System.out.println("Min is:" + " " + min);
                System.out.println("Min is:" + " " + min);
                System.out.println("У нас 3 числа =" + " " + min );

            }

        }



    }
}

