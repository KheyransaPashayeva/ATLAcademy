import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] newarray = new int[n];
        for (int i = 0; i < n; i++) {
            newarray[i] = sc.nextInt();
        }
        int max =newarray[0];
        int min =newarray[0];
        int sum = newarray[0];
        int product = newarray[0];
        for (int i = 1; i < newarray.length; i++) {
            if (max < newarray[i]) {
                max=newarray[i];
            }if (min>newarray[i]) {
                min=newarray[i];
            }
            sum=sum+ newarray[i];
            product = product*newarray[i];
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(product);
        System.out.println(Arrays.toString(newarray));
        for (int i = 0; i < newarray.length; i++) {
            if (newarray[i] == max) {
               newarray[i]=min;
            } else if(newarray[i]==min){
               newarray[i]=max;
            }
        }
        System.out.println(Arrays.toString(newarray));
    }
}
