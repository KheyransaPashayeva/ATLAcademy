package lesson16;

import java.util.Arrays;
import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        String[][] scedule = new String[7][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Heftenin plani:");
        scedule[0][0] = "Sunday".toLowerCase();
        scedule[1][0] = "Monday".toLowerCase();
        scedule[2][0] = "Tuesday".toLowerCase();
        scedule[3][0] = "wednesday".toLowerCase();
        scedule[4][0] = "Thursday".toLowerCase();
        scedule[5][0] = "Friday".toLowerCase();
        scedule[6][0] = "Saturday".toLowerCase();
        for (int i = 0; i < 7; i++) {
            scedule[i][1]=sc.nextLine();
        }
        System.out.println(Arrays.toString(scedule));
        String day =sc.next().toLowerCase();
        switch (day){
            case "sunday":
                System.out.println(scedule[0][1]);
                break;
            case "monday":
                System.out.println(scedule[1][1]);
                break;
            case "tuesday":
                System.out.println(scedule[2][1]);
                break;
            case "wednesday":
                System.out.println(scedule[3][1]);
                break;
            case "thursday":
                System.out.println(scedule[4][1]);
                break;
            case "friday":
                System.out.println(scedule[5][1]);
                break;
            case "saturday":
                System.out.println(scedule[6][1]);
                break;
            default:
                System.out.println("daxil etdiyiniz gun yanlisdir");




        }
    }

}

