package lesson19;

import java.util.ArrayList;
import java.util.Scanner;

public class OddaddList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2 = sc.nextInt();

        oddadditem(num1,num2);
    }
    public static void oddadditem(int num1,int num2){
        ArrayList<Integer> mylist=new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            if(i%2==1){
                mylist.add(i);
            }
        }
        System.out.println(mylist);
    }
}
