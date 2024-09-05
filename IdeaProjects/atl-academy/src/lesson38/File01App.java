package lesson38;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class File01App {
    public static final String RESOURCE="src/lesson38/resource/";
    public static void main(String[] args) {
        Person person =new Person("xeyransa","paSAYEA",27);
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("Gunel","Hesenova",24));
        arrayList.add(new Person("Ceyhune","Nebizadeh",24));

        try(FileOutputStream fos= new FileOutputStream(RESOURCE+"person.ser");
            BufferedOutputStream bos =new BufferedOutputStream(fos);
            ObjectOutputStream obj =new ObjectOutputStream(bos)) {
            obj.writeObject(arrayList);
        }catch (IOException e){
            e.getMessage();
        }

        try(FileInputStream fos= new FileInputStream(RESOURCE+"person.ser");
            BufferedInputStream bos =new BufferedInputStream(fos);
            ObjectInputStream obj =new ObjectInputStream(bos)) {
           ArrayList<Object> object= (ArrayList<Object>) obj.readObject();
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(object);
            }
        }catch (IOException | ClassNotFoundException e){
            e.getMessage();
        }

    }
}
