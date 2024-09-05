import java.util.Scanner;

public class MonthRubApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if((N>=1 && N<=3)){
            System.out.println("First");

        } else if (N>=4 && N<=6) {
            System.out.println( "Second");
        } else if (N>=7 && N<=9) {
            System.out.println( "Third");
        } else if (N>=10 && N<=12) {
            System.out.println( "Fourth");
        }
    }
}
