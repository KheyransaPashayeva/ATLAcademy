import java.util.Scanner;

public class twoNumSquareApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = n/10;
        int num2 = n%10;
        int sum = num1 + num2;
        int square =sum*sum;
        System.out.println(square);
    }
}
