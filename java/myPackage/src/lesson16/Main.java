package lesson16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random()*100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olmasa adinizi daxiledin:");
        String name = sc.next();
        System.out.println("Oyun basladi!!!");

        while (randomNum>0){
            System.out.println("Eded daxil edin");
            int num = sc.nextInt();
            if(num>randomNum){
                System.out.println("Daxil edilen eded boyukdur");
            }else if(randomNum<num){
                System.out.println("Daxil etdiyiniz eded kicikdir");
            }else {
                System.out.println("Tebrikler qazandiniz!!");
                break;
            }

        }

    }
}
