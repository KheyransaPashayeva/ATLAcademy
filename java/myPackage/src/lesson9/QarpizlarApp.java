package lesson9;
import java.util.Scanner;

public class QarpizlarApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 30000;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int kq = sc.nextInt();
            if (max < kq) {
                    max = kq;
                }
            if (min > kq) {
                    min = kq;
                }
            }
            if (n < 2) {
                System.out.println("Ooops!");
            } else{
                System.out.println(min + " " + max);
            }
        }
    }
