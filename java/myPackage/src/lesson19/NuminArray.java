package lesson19;

import java.util.*;

public class NuminArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a1 ="A";
        System.out.println(a1);
        System.out.println(a1);
        System.out.println("Zəhmət olmasa, tiplərin növünü seçin:");
        System.out.println("1. List");
        System.out.println("2. Set");

        int choice = scanner.nextInt();

        Collection<Integer> collection;

        if (choice == 1) {
            collection = new ArrayList<>();
            System.out.println("List-in icerisini doldur");
            while (true) {
                String input = scanner.next();
                if (input.equals("end")) {
                    break;
                }
                collection.add(Integer.valueOf(input));
            }

        } else if (choice == 2) {
            collection = new HashSet<>();
            System.out.println("Set- in icerisini doldur");
            while (true) {
                String input = scanner.next();
                if (input.equals("end")) {
                    break;
                }
                collection.add(Integer.valueOf(input));
            }
        } else {
            System.out.println("Yanlış seçim!");
            return;
        }
        System.out.print("yoxlamaq ucun eded daxil et:");
        int num = scanner.nextInt();
        numisInList(collection,num);
    }
    public  static void numisInList(Collection<Integer> collection, int num){
        for (Integer n:collection) {
            if (n == num) {
                System.out.println("Yes");
                break;
            }
            else {
                System.out.println("No");
                break;
            }
        }
    }

}
