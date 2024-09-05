import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int say =1;
        for (int i = 0; i < 9; i++) {
            n=n/10;
           if(n>0) {
               say += 1;
           }
        }System.out.println(say);

    }
}
