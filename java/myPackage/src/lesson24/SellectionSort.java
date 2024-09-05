package lesson24;

import java.util.Arrays;

public class SellectionSort {
    public static void main(String[] args) {
        int[] arr ={5,3,6,2,4};
        int min=arr[0];
        int temp=0;
        int eded=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j]<min) {
                    min=arr[j];
                    temp=j;
                }
            }if(temp !=i){
                eded=arr[temp];
                arr[temp]=arr[i];
                arr[i]=eded;
            }


        }
        System.out.println(Arrays.toString(arr));
    }
}
