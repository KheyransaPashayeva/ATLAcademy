
import java.io.*;

public class Main {
    public static final String RESOURCE ="src/lesson33/lesson38.resource/";
    public static void main(String[] args) throws IOException
    {
        int ch;
        // Accept a string
        File file =new File(RESOURCE+"out.txt");

        // attach a file to FileWriter
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello");
        bw.close();
        fw.close();

        try {
            FileReader fr = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fr);
            String line;
            while ((line=bufferedReader.readLine()) != null)
                System.out.print(line);
            bufferedReader.close();
            fr.close();
        }catch (IOException e){
            e.getStackTrace();
        }

        System.out.println();
        System.out.println("Writing successful");
    }
}
