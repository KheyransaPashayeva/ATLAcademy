package lesson27;

import lesson26.CustomException;
import lesson26.Ramada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CustomException, lesson27.CustomException {
        Book book1 = new Book();
        Book book2 = new Book();
        book1.returnBook();
        book1.borrowBook();
        if (book1 instanceof Book) {
            System.out.println("okey object in Book");
        } else {
            throw new CustomException("bele obyekt Book da yoxdur");
        }

        System.out.println(book1);
        Scanner sc = new Scanner(System.in);

        try {
            String s=sc.next();
            int i =Integer.parseInt(s);
            System.out.println(i);

        }catch (NumberFormatException e){
            System.out.println("string not integer");
        }
    }

}
