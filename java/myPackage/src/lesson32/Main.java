package lesson32;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Person person=new Person("Xeyransa","Pashayeva",27);
        Field field =person.getClass().getDeclaredField("firstname");

    }

}
