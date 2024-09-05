import java.util.Scanner;

public class SameSignApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n!=0 && m!=0) {
            if ((n > 0 && m > 0)|(n<0 && m<0)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
