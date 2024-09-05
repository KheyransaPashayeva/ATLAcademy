import java.util.Scanner;

public class FourMaxApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a>b && a>c && a>d ) {
            System.out.println(a);
        } else if (a < b && b > c && b > d ) {
            System.out.println(b);
        } else if (a < c && b < c && c > d ) {
            System.out.println(c);
        }else if (d > a && d > b &&  d > c ){
            System.out.println(d);
        }
    }
}


/* public class FOUR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int maximum = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println(maximum);

    }
}

 */
