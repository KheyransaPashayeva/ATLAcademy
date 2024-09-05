package lesson10;

import java.util.Scanner;

public class EnkicikApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextInt();
        long i =0;
        long sum =0;
        while (k>0){
            i++;
            sum+=i;
            if (sum %k ==0) {
                System.out.println(i);
                break;
            }

        }
    }
}
