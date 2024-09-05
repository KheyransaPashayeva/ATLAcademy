package lesson39;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JsonApp {
    public static final String RESOURCE="src/lesson39/resource/";
    public static final Path PATH= Paths.get(RESOURCE+"person.txt");
    public static void main(String[] args) throws IOException, JsonProcessingException {
        Person person=new Person("Xeyrasnsa","Pasayeva",25);
        String personjson="";

        {
            ObjectMapper om =new ObjectMapper();
            personjson=om.writeValueAsString(person);
        }
        System.out.println(personjson);
        ObjectMapper om =new ObjectMapper();
        om.writeValueAsBytes(person);

        try {
            List<String> strings = Files.readAllLines(PATH);
            System.out.println(strings);
        }catch (IOException e){
            e.getMessage();
        }
    }

}
