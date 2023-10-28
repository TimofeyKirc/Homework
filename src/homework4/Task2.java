package homework4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {


        int[] arr = {-11, 4, -2, 23, 1, 12, 17, 5, -3, 9};

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                min = i;
            }
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                max = i;
            }
        }
        min = arr[min];
        arr[min] = arr[max];
        arr[max] = 0;
        System.out.println(Arrays.toString(arr));
    }

}





