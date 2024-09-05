import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int min = num/100;
        int max = num%10;
        if(min>max) {
            System.out.println(min);
        }else if(min<max) {
            System.out.println(max);
        }else {
            System.out.println("=");
        }

    }
}
