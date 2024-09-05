import java.util.Scanner;

public class IntervalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ( a<=x && x<=b) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
