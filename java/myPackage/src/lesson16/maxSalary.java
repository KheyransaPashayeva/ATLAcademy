package lesson16;

import java.util.Scanner;

public class maxSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maxSalary =0.0;
        double salary;
        while (sc.hasNext()){
            salary = sc.nextDouble();
            if (salary >maxSalary) {
                maxSalary = salary;

            }
        }
    System.out.printf("%.2f",maxSalary);



    }

}
