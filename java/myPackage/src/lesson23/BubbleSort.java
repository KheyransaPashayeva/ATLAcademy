package lesson23;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={5,3,6,2,4};
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;

                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
