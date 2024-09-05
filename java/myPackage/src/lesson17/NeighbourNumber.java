package lesson17;

import java.util.Scanner;

public class NeighbourNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count =0;
        int[] arr= new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]<arr[i] && arr[i]<arr[i+1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
