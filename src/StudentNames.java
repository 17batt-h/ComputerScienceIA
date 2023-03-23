import java.util.ArrayList;

public class StudentNames {

    public static ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<String>();
        names = FileHandling.wholeFileRead(Main.inputFile);
        return names;
    }

}
