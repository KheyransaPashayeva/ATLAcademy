import java.util.Scanner;

public class TotalDivisionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a%b) != 0) {
            int tam = a/b;
            int couts = a%b;
            System.out.print(tam+" "+couts);
        }else {
            System.out.println("Divisible");
        }
    }
}
