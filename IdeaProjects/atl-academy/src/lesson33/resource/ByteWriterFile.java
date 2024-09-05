package lesson33.resource;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class ByteWriterFile {
    public static final String RESOURCE ="src/lesson33/lesson38.resource/";
    public static void main(String[] args) {
        byte[] bytes=new byte[20];
        for (int i = 0; i <20; i++) {

        }
        try{
            FileOutputStream fos =new FileOutputStream(RESOURCE+"out.txt");
            BufferedOutputStream bos =new BufferedOutputStream(fos);
            for (int i = 0; i < 20; i++) {
                double random=Math.random();
                int randomnumber=(int) (random*100);
                bos.write(randomnumber);
            }
            bos.close();
            fos.close();
        }catch (IOException e){
            e.getMessage();
        }
        try{
            FileInputStream fis = new FileInputStream(RESOURCE+"out.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            bytes = bis.readAllBytes();
            System.out.println(Arrays.toString(bytes));
        }catch (IOException e){
            e.getMessage();
        }
    }
}
