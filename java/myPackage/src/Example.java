import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>10 && num<100){
            int tam = num/10;
            int cuts = num%10;
            System.out.println(tam +" "+ cuts);

        }
    }
}
