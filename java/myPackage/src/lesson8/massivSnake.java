package lesson8;

import java.util.Scanner;

public class massivSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] []arr = new int[n][n];
        int counter =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                counter++;

                if(i%2==0) {

                    arr[i][j] = counter;
                }else {
                    arr[i][(n-1)-j] = counter;
                }


            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
