import java.util.Scanner;
public class Fesil {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if((num>=1 && num<=2) | num == 12){
                System.out.println("Winter");

            } else if (num>=3 && num<=5) {
                System.out.println( "Spring");
            } else if (num>=6 && num<=8) {
                System.out.println( "Summer");
            } else if (num>=9 && num<=11) {
                System.out.println( "Autumn");
            }
        }
    }

