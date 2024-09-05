package lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class arrCountSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] nums = n.split("\\s+");
        int arrlenght = 0;
        int sum =0;
        for (String num:nums){
            int num1 =Integer.parseInt(num);
            arrlenght++;
            sum+=num1;
        }
        System.out.print(arrlenght);
        System.out.println(" " +sum);
    }
}

