import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class FileHandling {
    // read lines from a file
    private static int count;

    public static void fileRead(String filename){
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                count++;
                line = br.readLine();
            }
            } catch (IOException e){
                e.printStackTrace();
        }
    }
}
