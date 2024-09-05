package lesson17;

import java.util.Scanner;

public class ArrayMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count =0;
        int[] arr= new int[size];
        int maxelem = arr[0];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]>maxelem) {
                maxelem=arr[i];
                count=i+1;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>maxelem) {
//                maxelem=arr[i];
//                count=i+1;
//            }
//
//        }
        System.out.print(maxelem+ " " +count);
    }
}
