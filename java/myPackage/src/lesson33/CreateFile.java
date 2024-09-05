package lesson33;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CreateFile {
    public static final String RESOURCE ="myPackage/src/lesson33/resource/";
        public static void main(String[] args) throws IOException
        {
            // Accept a string
           File file =new File(RESOURCE+"out.txt");

            // attach a file to FileWriter
            FileWriter fw=new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("hello");
            bw.close();
            System.out.println("Writing successful");
            //close the file
            fw.close();
        }
    }
