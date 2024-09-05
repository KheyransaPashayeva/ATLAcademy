package lesson24;

import java.time.LocalDate;
import java.util.Date;

public class Methods {
    public static void main(String[] args) {
        runtime("aa");
        runtime(5);
        runtime(LocalDate.now());
    }
    public static void runtime(String s){
        if ( s== null) {
          throw new NullPointerException();
        }
        System.out.println("String");
    }
    public static void runtime(Integer i){
        if ( i == null) {
            throw new NullPointerException();
        }
        System.out.println("Intger");
    }
    public static void runtime(LocalDate d){
        if ( d== null) {
            throw new NullPointerException();
        }
        System.out.println("date");
    }
}
