import java.util.ArrayList;

public class StudentNames {

    public ArrayList<String> getNames(String inputFile){
        ArrayList<String> names = new ArrayList<String>();
        names = FileHandling.wholeFileRead(inputFile);
        return names;
    }

}
